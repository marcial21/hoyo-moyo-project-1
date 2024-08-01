package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.models.Weapon;

public interface WeaponRepository extends JpaRepository<Weapon, Integer> {
    
}
