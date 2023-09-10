package com.HealthCare.MedicalTest.domain;



import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private int age;
    private String gender;
    private String emailId;
    private int phoneNumber;
    private String location;
}
