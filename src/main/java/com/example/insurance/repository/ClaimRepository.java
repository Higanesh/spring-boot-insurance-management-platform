package com.example.insurance.repository;

import com.example.insurance.entity.Claim;
import com.example.insurance.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClaimRepository extends JpaRepository<Claim,Double> {



}
