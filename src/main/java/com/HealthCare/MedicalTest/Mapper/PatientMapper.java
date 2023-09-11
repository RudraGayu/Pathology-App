package com.HealthCare.MedicalTest.Mapper;

import com.HealthCare.MedicalTest.DTO.PatientDTO;
import com.HealthCare.MedicalTest.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientMapper {

    public Patient DTOToEntity(PatientDTO patientDTO){
        Patient patient = new Patient();
        patient.setUserName(patientDTO.getUserName());
        patient.setName(patientDTO.getName());
        patient.setAge(patientDTO.getAge());
        patient.setGender(patientDTO.getGender());
        patient.setEmailId(patientDTO.getEmailId());
        patient.setPhoneNumber(patientDTO.getPhoneNumber());
        patient.setLocation(patientDTO.getLocation());
        return patient;
    }

    public PatientDTO EntityToDTO(Patient patient){
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patient.getId());
        patientDTO.setUserName(patient.getUserName());
        patientDTO.setName(patient.getName());
        patientDTO.setAge(patient.getAge());
        patientDTO.setGender(patient.getGender());
        patientDTO.setEmailId(patient.getEmailId());
        patientDTO.setPhoneNumber(patient.getPhoneNumber());
        patientDTO.setLocation(patient.getLocation());
        return patientDTO;
    }
}
