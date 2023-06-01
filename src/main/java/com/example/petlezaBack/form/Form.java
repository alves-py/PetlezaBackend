package com.example.petlezaBack.form;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "forms")
@Entity(name = "forms")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Form {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private Integer age;
    private String species;
    private String race;
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

    public Form(FormRequestDTO data) {
            this.name = data.name();
            this.image = data.image();
            this.age = data.age();
            this.species = data.species();
            this.race = data.race();
            this.gender = data.gender();
            this.cadastred = data.cadastred();
            this.weight = data.weight();
            this.personality = data.personality();
            this.habits_food = data.habits_food();
            this.habits_hygiene = data.habits_hygiene();
            this.special_needs = data.special_needs();
            this.pet_activities = data.pet_activities();
            this.specific_behavior = data.specific_behavior();
            this.social_interactions = data.social_interactions();
            this.current_medications = data.current_medications();
            this.allergy = data.allergy();
            this.illnesses = data.illnesses();
            this.surgeries = data.surgeries();
            this.tutor_name = data.tutor_name();
            this.tutor_phone = data.tutor_phone();
            this.last_consultation = data.last_consultation();
    }
}
