package com.devstack.healthcare.util.mapper;

import com.devstack.healthcare.dto.request.RequestDoctorDto;
import com.devstack.healthcare.dto.response.ResponseDoctorDto;
import com.devstack.healthcare.entity.Doctor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    ResponseDoctorDto toResponseDoctorDto(Doctor doctor);
    Doctor toDoctor(RequestDoctorDto dto);
    List<ResponseDoctorDto> toResponseDoctorDtoList(List<Doctor> list);
}
