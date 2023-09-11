package com.HealthCare.MedicalTest.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {

    private String id;
    private String userName;
    private String name;
    private int age;
    private String gender;
    private String emailId;
    private int phoneNumber;
    private String location;
}
