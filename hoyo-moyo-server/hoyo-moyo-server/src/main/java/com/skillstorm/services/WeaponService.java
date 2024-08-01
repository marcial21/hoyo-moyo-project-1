package com.skillstorm.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Weapon;
import com.skillstorm.repositories.WeaponRepository;

@Service
public class WeaponService {
    private WeaponRepository repository;

    public WeaponService(WeaponRepository repository) {
        this.repository = repository;
    }

    public Iterable<Weapon> findAll() {
        return repository.findAll(); 
    }

    public Optional<Weapon> findById(int id) {
        return repository.findById(id);
    }
    
}
