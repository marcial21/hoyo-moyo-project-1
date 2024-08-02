package com.skillstorm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Character;
import com.skillstorm.repositories.CharacterRepository;

@Service
public class CharacterService {
    private CharacterRepository repository;

    public CharacterService(CharacterRepository characterRepository) {
        this.repository = characterRepository;
    }

    public Iterable<Character> findAll() {
        return repository.findAll(); 
    }

    public Optional<Character> findById(int id) {
        return repository.findById(id);
    }

    public List<Character> findByWarehouseId(int id) {
        return repository.findByWarehouseId(id);
    }
}
