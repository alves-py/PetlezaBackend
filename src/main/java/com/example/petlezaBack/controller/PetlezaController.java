package com.example.petlezaBack.controller;

import com.example.petlezaBack.form.Form;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class PetlezaController {

    @GetMapping
    public void getAll(){

        Form form
    }
}
