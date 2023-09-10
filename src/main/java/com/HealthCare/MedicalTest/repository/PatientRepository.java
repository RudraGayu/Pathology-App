package com.HealthCare.MedicalTest.repository;


import com.HealthCare.MedicalTest.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,String> {
}
