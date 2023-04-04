package com.example.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "INSURANCEPOLICY_TBL")
public class InsurancePolicy {

    @Id
    @GeneratedValue
    private double policyNumber;
    private String policyType;
    private double coverageAmount;
    private double premium;
    private String startDate;
    private String endDate;
}
