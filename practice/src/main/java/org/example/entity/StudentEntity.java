package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")

public class StudentEntity {

@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String fristName;
    private String lastname;
    private String ContactNumber;

}
