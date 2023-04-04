package com.example.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLAIM_TBL")
public class Claim {

    @Id
    @GeneratedValue
    private int claimNumber;
    private String description;
    private String claimDate;
    private String claimStatus;



}
