package com.example.insurance.repository;

import com.example.insurance.entity.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<InsurancePolicy, Double> {

}
