package com.devstack.healthcare;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.devstack.healthcare.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication

public class HealthcareApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRoleService.initializeRoles();//----
	}
}
