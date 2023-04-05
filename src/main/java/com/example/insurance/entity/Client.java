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
@Table(name = "CLIENT_TBL")
public class Client {

    @Id
    @GeneratedValue
    private int clientId;
    private String name;
    private String dateOfBirth;
    private String address;
    private String contactInfo;
}
