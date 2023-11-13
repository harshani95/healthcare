package com.devstack.healthcare.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Doctor {
    @Id
    private long id;
    private String name;
    private String address;
    private String contact;
    private double salary;
}
