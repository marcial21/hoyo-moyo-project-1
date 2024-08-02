package com.skillstorm.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.WarehouseRepository;

@Service
public class WarehouseService {
    private WarehouseRepository repository;

    public WarehouseService(WarehouseRepository repository) {
        this.repository = repository;
    }

    public Iterable<Warehouse> findAll() {
        return repository.findAll();
    }

    public Optional<Warehouse> findById(int id) {
        return repository.findById(id);
    }
}
