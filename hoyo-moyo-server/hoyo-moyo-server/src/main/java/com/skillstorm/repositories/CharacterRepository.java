package com.skillstorm.repositories;

import com.skillstorm.models.Character;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CharacterRepository extends JpaRepository<Character, Integer> {    
    @Query("SELECT c FROM Character c WHERE c.warehouseId = :warehouseId")
    List<Character> findByWarehouseId(@Param("warehouseId") int warehouseId);

}
