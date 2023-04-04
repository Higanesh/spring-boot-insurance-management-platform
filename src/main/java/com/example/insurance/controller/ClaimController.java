package com.example.insurance.controller;

import com.example.insurance.entity.Claim;
import com.example.insurance.entity.Client;
import com.example.insurance.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClaimController {

    @Autowired
    private ClaimService service;

    @PostMapping("/addClaim")
    public Claim addClaim(@RequestBody Claim claim)
    {
        return service.saveClaim(claim);
    }

    @PostMapping("/addClaims")
    public List<Claim> addClients(@RequestBody List<Claim> claims) {
        return service.saveClaims(claims);
    }

    @GetMapping("/getClaims")
    public List<Claim> findAllClaims() {
        return service.getClaims();
    }

    @GetMapping("/ClaimByNumber/{claimNumber}")
    public Claim findClaimById(@PathVariable double claimNumber) {
        return service.getClaimById(claimNumber);
    }

    @PutMapping("/updateClaim")
    public Claim updateClaim(@RequestBody Claim claim) {
        return service.updateclaim(claim);
    }

    @DeleteMapping("/delete/{claimNumber}")
    public String deleteClaim(@PathVariable double claimNumber) {
        return service.deleteClaim(claimNumber);
    }

}
