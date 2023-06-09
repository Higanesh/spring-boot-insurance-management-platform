package com.example.insurance.service;


import com.example.insurance.entity.InsurancePolicy;
import com.example.insurance.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository repository;

    public InsurancePolicy saveInsurancePolicy(InsurancePolicy insurancepolicy) {
        return repository.save(insurancepolicy);
    }

    public List<InsurancePolicy> saveInsurancePolicys(List<InsurancePolicy> insurancepolicys) {
        return repository.saveAll(insurancepolicys);
    }

    public List<InsurancePolicy> getInsurancePolicy() {
        return repository.findAll();
    }

    public InsurancePolicy getPolicyById(int policyNumber) {
        return repository.findById(policyNumber).orElse(null);
    }

    public InsurancePolicy updateInsurancePolicy(int policyNumber,InsurancePolicy insurancepolicy) {
        InsurancePolicy existingPolicy = repository.findById(policyNumber).orElse(null);
        existingPolicy.setPolicyType(insurancepolicy.getPolicyType());
        existingPolicy.setCoverageAmount(insurancepolicy.getCoverageAmount());
        existingPolicy.setPremium(insurancepolicy.getPremium());
        existingPolicy.setStartDate(insurancepolicy.getStartDate());
        existingPolicy.setEndDate(insurancepolicy.getEndDate());
        return repository.save(existingPolicy);
    }

    public String deleteInsurancePolicy(int policyNumber) {
        repository.deleteById(policyNumber);
        return "Insurance Policy removed !! " + policyNumber;
    }
}
