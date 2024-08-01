package com.skillstorm.services;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Character;
import com.skillstorm.repositories.CharacterRepository;

@Service
public class CharacterService {
    private CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Iterable<Character> findAll() {
        return characterRepository.findAll(); 
    }
}
