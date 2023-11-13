package com.devstack.healthcare.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestDoctorDto {
    public String name;
    public String address;
    public String contact;
    public double salary;
}
