package com.devstack.healthcare.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDoctorDto {
    private long id;
    private String name;
    private String address;
    private String contact;
    private double salary;
}
