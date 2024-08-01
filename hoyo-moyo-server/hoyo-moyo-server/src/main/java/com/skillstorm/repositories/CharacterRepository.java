package com.skillstorm.repositories;

import com.skillstorm.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Integer> {

    // @Query(value = "select m from character", nativeQuery = false)
    // List<Character> findAll();
    
    
}
