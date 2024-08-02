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

import com.skillstorm.models.Artifact;
import com.skillstorm.services.ArtifactService;

@RestController
@RequestMapping("/artifacts")
@CrossOrigin(origins = "http://localhost:5173")
public class ArtifactController {
    @Autowired
    private ArtifactService service;

    @GetMapping
    public Iterable<Artifact> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artifact> findById(@PathVariable int id) {
        Optional<Artifact> artifact = service.findById(id);
        if (artifact.isPresent()) {
            return ResponseEntity.ok(artifact.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
    }
}
