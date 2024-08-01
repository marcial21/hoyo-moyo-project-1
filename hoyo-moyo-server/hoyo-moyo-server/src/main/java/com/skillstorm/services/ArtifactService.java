package com.skillstorm.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Artifact;
import com.skillstorm.repositories.ArtifactRepository;

@Service
public class ArtifactService {
    private ArtifactRepository repository;

    public ArtifactService(ArtifactRepository repository) {
        this.repository = repository;
    }
    
    public Iterable<Artifact> findAll() {
        return repository.findAll(); 
    }

    public Optional<Artifact> findById(int id) {
        return repository.findById(id);
    }
    
}
