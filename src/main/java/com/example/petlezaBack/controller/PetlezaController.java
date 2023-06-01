package com.example.petlezaBack.controller;

import com.example.petlezaBack.form.Form;
import java.util.stream.Collectors;
import com.example.petlezaBack.form.FormRepository;
import com.example.petlezaBack.form.FormResponseDTO;
import com.example.petlezaBack.form.FormRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("form")
public class PetlezaController {

    @Autowired
    private FormRepository repository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveForm(@RequestBody FormRequestDTO data){
        Form formData = new  Form(data);
        repository.save(formData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FormResponseDTO> getAll(){

        List<FormResponseDTO> formList = (List<FormResponseDTO>) repository.findAll().stream().map(FormResponseDTO::new).collect(Collectors.toList());
        return  formList;

    }
}
