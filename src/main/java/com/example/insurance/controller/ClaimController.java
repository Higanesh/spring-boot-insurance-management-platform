package com.example.insurance.controller;

import com.example.insurance.entity.Claim;
import com.example.insurance.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClaimController {

    @Autowired
    private ClaimService service;

    @PostMapping("/api/claims")
    public Claim addClaim(@RequestBody Claim claim)
    {
        return service.saveClaim(claim);
    }

    @PostMapping("/api/multipleclaims")
    public List<Claim> addClients(@RequestBody List<Claim> claims) {
        return service.saveClaims(claims);
    }

    @GetMapping("/api/claims")
    public List<Claim> findAllClaims() {
        return service.getClaims();
    }

    @GetMapping("/api/claims/{claimNumber}")
    public Claim findClaimById(@PathVariable int claimNumber) {
        return service.getClaimById(claimNumber);
    }

    @PutMapping("/api/claims/{claimNumber}")
    public Claim updateClaim(@PathVariable int claimNumber, @RequestBody Claim claim) {
        return service.updateclaim(claimNumber,claim);
    }

    @DeleteMapping("/api/claims/{claimNumber}")
    public String deleteClaim(@PathVariable int claimNumber) {
        return service.deleteClaim(claimNumber);
    }

}
