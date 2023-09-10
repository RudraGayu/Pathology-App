package com.HealthCare.MedicalTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.HealthCare.MedicalTest.domain"})
public class MedicalTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalTestServiceApplication.class, args);
	}

}
