package com.api.countriescodes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.countriescodes.repository.CountryRepository;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    CountryRepository repo;

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola";
    }

    @GetMapping("/all")
    public long get(){
        return repo.count();
    }
}
