package com.HealthCare.MedicalTest.service;

import com.HealthCare.MedicalTest.DTO.PatientDTO;
import com.HealthCare.MedicalTest.DTO.UpdatePatientDTO;
import com.HealthCare.MedicalTest.domain.Patient;

public interface MedicalTestService {

 String addNewUser(PatientDTO patientDTO);

 Iterable<Patient> getAllUsers();

 PatientDTO updateUser(UpdatePatientDTO updatePatientDTO);

 String deleteUser(String userName);
}
