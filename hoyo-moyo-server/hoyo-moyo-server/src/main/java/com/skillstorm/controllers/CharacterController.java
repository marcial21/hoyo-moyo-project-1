package com.skillstorm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Character;
import com.skillstorm.services.CharacterService;

@RestController
@RequestMapping("/characters")
public class CharacterController {
    
    @Autowired
    private CharacterService service; 

    @GetMapping
    public Iterable<Character> findAll() {
        return service.findAll();
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello";
    }
}
