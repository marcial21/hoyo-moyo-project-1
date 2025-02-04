package com.skillstorm.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Weapon;
import com.skillstorm.services.WeaponService;

@RestController
@RequestMapping("/weapons")
@CrossOrigin(origins = "http://localhost:5173")
public class WeaponController {
    
    @Autowired
    private WeaponService service;

    @GetMapping
    public Iterable<Weapon> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Weapon> findById(@PathVariable int id) {
        Optional<Weapon> weapon = service.findById(id);
        if (weapon.isPresent()) {
            return ResponseEntity.ok(weapon.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
    }
}
