package com.example.insurance.controller;



import com.example.insurance.entity.InsurancePolicy;
import com.example.insurance.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsuranceController {

    @Autowired
    private InsuranceService service;

    @PostMapping("/api/policies")
    public InsurancePolicy addInsurance(@RequestBody InsurancePolicy insurancepolicy) {
        return service.saveInsurancePolicy(insurancepolicy);
    }

    @PostMapping("/api/multiplepolicies")
    public List<InsurancePolicy> addInsurances(@RequestBody List<InsurancePolicy> insurancepolicys) {
        return service.saveInsurancePolicys(insurancepolicys);
    }

    @GetMapping("/api/policies")
    public List<InsurancePolicy> findAllInsurancePolicys() {
        return service.getInsurancePolicy();
    }

    @GetMapping("/api/policies/{policyNumber}")
    public InsurancePolicy findPolicyByNumber(@PathVariable int policyNumber) {
        return service.getPolicyById(policyNumber);
    }

    @PutMapping("/api/policies/{policyNumber}")
    public InsurancePolicy updateInsurancePolicy(@PathVariable int policyNumber, @RequestBody InsurancePolicy insurancepolicy) {
        return service.updateInsurancePolicy(policyNumber,insurancepolicy);
    }

    @DeleteMapping("/api/policies/{policyNumber}")
    public String deleteInsurancePolicy(@PathVariable int policyNumber) {
        return service.deleteInsurancePolicy(policyNumber);
    }
}
