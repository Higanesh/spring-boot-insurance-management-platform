package com.example.insurance.service;


import com.example.insurance.entity.Claim;
import com.example.insurance.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository repository;

    public Claim saveClaim(Claim claim) {
        return repository.save(claim);
    }

    public List<Claim> saveClaims(List<Claim> claims) {
        return repository.saveAll(claims);
    }

    public List<Claim> getClaims() {
        return repository.findAll();
    }

    public Claim getClaimById(int claimNumber) {
        return repository.findById(claimNumber).orElse(null);
    }

        public Claim updateclaim(int claimNumber,Claim claim) {
        Claim existingClaim = repository.findById(claimNumber).orElse(null);
        existingClaim.setDescription(claim.getDescription());
        existingClaim.setClaimDate(claim.getClaimDate());
        existingClaim.setClaimStatus(claim.getClaimStatus());
        return repository.save(existingClaim);
    }

    public String deleteClaim(int claimNumber) {
        repository.deleteById(claimNumber);
        return "Claim removed !! " + claimNumber;
    }


}
