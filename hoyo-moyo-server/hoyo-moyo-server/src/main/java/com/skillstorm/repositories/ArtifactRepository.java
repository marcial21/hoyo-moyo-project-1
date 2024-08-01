package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.models.Artifact;

public interface ArtifactRepository extends JpaRepository<Artifact, Integer> {
    
}
