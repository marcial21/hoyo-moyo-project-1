package com.skillstorm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Character;
import com.skillstorm.services.CharacterService;

@RestController
@RequestMapping("/characters")
@CrossOrigin(origins = "http://localhost:5173")
public class CharacterController {

    private CharacterService service; 

    public CharacterController(CharacterService characterService) {
        this.service = characterService;
    }

    @GetMapping
    public Iterable<Character> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Character> findById(@PathVariable int id) {
        Optional<Character> character = service.findById(id);
        if (character.isPresent()) {
            return ResponseEntity.ok(character.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
    }

    @GetMapping("/warehouseId/{warehouseId}")
    public ResponseEntity<List<Character>> findByWarehouseId(@PathVariable int warehouseId) {
        List<Character> characters = service.findByWarehouseId(warehouseId);
        if (characters.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    //TODO: Add new character
    //TODO: equip weapon
        //Make sure that the weapon exists, and no one else has it. 
    //TODO: Unequip weapon
    //TODO: Equip artifacts
        // check for existence and if no one else has it. 
    //TODO: Unequip artifacts

    //TODO: Level up character
        // check for maximum level reached.
}
