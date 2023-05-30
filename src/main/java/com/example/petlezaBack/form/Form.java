package com.example.petlezaBack.form;

import jakarta.persistence.*;

@Table(name = "forms")
@Entity(name = "forms")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idForm;
    private String name;
    private String image;
    private Integer age;
    private String species;
    private String Race;
    private String gender;
    private String cadastred;
    private Float weight;
    private String personality;
    private String habits_food;
    private String habits_hygiene;
    private String special_needs;
    private String pet_activities;
    private String specific_behavior;
    private String social_interactions;
    private String current_medications;
    private String allergy;
    private String illnesses;
    private String surgeries;
    private String tutor_name;
    private String tutor_phone;
    private String last_consultation;

}
