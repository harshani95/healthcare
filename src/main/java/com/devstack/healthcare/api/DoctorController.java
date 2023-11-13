package com.devstack.healthcare.api;

import com.devstack.healthcare.dto.request.RequestDoctorDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    @PostMapping
    public String createDoctor(@RequestBody RequestDoctorDto doctorDto){
        return "createDoctor";
    }

    @GetMapping
    public String findDoctor(){
        return "findDoctor";
    }

    @DeleteMapping
    public String deleteDoctor(){
        return "deleteDoctor";
    }

    @PutMapping
    public String updateDoctor(){
        return "updateDoctor";
    }

    @GetMapping(path = "/list")
    public String findAllDoctors(){
        return "findAllDoctors";
    }
}
