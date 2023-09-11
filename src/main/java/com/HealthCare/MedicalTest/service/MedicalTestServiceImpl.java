package com.HealthCare.MedicalTest.service;

import com.HealthCare.MedicalTest.DTO.PatientDTO;
import com.HealthCare.MedicalTest.DTO.UpdatePatientDTO;
import com.HealthCare.MedicalTest.Mapper.*;
import com.HealthCare.MedicalTest.domain.Patient;
import com.HealthCare.MedicalTest.exception.ResourceNotFoundException;
import com.HealthCare.MedicalTest.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalTestServiceImpl implements MedicalTestService{

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public String addNewUser(PatientDTO patientDTO) {
        if(patientRepository.findByUserName(patientDTO.getUserName())!=null){
            return "Username already exists Please try another username";
        }
        Patient patient = new Patient();
        patient = patientMapper.DTOToEntity(patientDTO);
        Patient patient1 = patientRepository.save(patient);
        PatientDTO patientDTOResponse = patientMapper.EntityToDTO(patient1);
        return "Registration was Successful";
    }

    @Override
    public Iterable<Patient> getAllUsers() {
        Iterable<Patient> patients = patientRepository.findAll();
        return patients;
    }

    @Override
    public PatientDTO updateUser(UpdatePatientDTO updatePatientDTO) {
        Patient patient = patientRepository.findByUserName(updatePatientDTO.getUserName());
        patient.setName(updatePatientDTO.getName());
        patient.setLocation(updatePatientDTO.getLocation());
        patientRepository.save(patient);
        PatientDTO patientDTOResponse = patientMapper.EntityToDTO(patient);
        return patientDTOResponse;
    }

    @Override
    public String deleteUser(String userName) {
        Patient patient = patientRepository.findByUserName(userName);
        if(patient == null){
            System.out.println("User Name not found in Database");
            throw new ResourceNotFoundException("User not found");
        }
        patientRepository.delete(patient);
        return "Deleted Successfully";
    }



}
