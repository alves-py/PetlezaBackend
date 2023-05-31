package com.example.petlezaBack.form;

public record FormResponseDTO(Integer id, String name, String image, Integer age, String species, String Race, String gender, String cadastred, Float weight, String personality, String habits_food, String habits_hygiene, String special_needs, String pet_activities, String specific_behavior, String social_interactions, String current_medications, String allergy, String illnesses, String surgeries, String tutor_name, String tutor_phone, String last_consultation) {

    public FormResponseDTO(Form form){
        this(form.getId(), form.getName(), form.getImage(), form.getAge(), form.getSpecies(), form.getRace(), form.getGender(), form.getCadastred(), form.getWeight(), form.getPersonality(), form.getHabits_food(), form.getHabits_hygiene(), form.getSpecial_needs(), form.getPet_activities(), form.getSpecific_behavior(), form.getSocial_interactions(), form.getCurrent_medications(), form.getAllergy(), form.getIllnesses(), form.getSurgeries(), form.getTutor_name(), form.getTutor_phone(), form.getLast_consultation());
    }
}