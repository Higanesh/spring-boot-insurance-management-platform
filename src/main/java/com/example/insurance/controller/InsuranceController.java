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

    @PostMapping("/addInsurancePolicy")
    public InsurancePolicy addInsurance(@RequestBody InsurancePolicy insurancepolicy) {
        return service.saveInsurancePolicy(insurancepolicy);
    }

    @PostMapping("/addInsurancePolicys")
    public List<InsurancePolicy> addInsurances(@RequestBody List<InsurancePolicy> insurancepolicys) {
        return service.saveInsurancePolicys(insurancepolicys);
    }

    @GetMapping("/getInsurancePolicys")
    public List<InsurancePolicy> findAllInsurancePolicys() {
        return service.getInsurancePolicy();
    }

    @GetMapping("/InsurancePolicyByPolicyNumber/{policyNumber}")
    public InsurancePolicy findPolicyByNumber(@PathVariable double policyNumber) {
        return service.getPolicyById(policyNumber);
    }

    @PutMapping("/update")
    public InsurancePolicy updateInsurancePolicy(@RequestBody InsurancePolicy insurancepolicy) {
        return service.updateInsurancePolicy(insurancepolicy);
    }

    @DeleteMapping("/delete/{policyNumber}")
    public String deleteInsurancePolicy(@PathVariable double policyNumber) {
        return service.deleteInsurancePolicy(policyNumber);
    }
}
