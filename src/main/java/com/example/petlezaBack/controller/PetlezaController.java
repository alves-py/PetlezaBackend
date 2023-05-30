package com.example.petlezaBack.controller;

import com.example.petlezaBack.form.Form;
import com.example.petlezaBack.form.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("form")
public class PetlezaController {

    @Autowired
    private FormRepository repository;
    @GetMapping
    public List<Form> getAll(){

        List<Form> formList = repository.findAll();
        return  formList;

    }
}
