package com.skillstorm.services;

import java.util.NoSuchElementException;
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

    public Warehouse save(Warehouse warehouse) {
        return repository.save(warehouse);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public void updateWarehouseById(int id, String name, Warehouse warehouse) {
        if (!repository.existsById(id)) 
            throw new NoSuchElementException("Warehouse with id " + id + " does not exist");
        warehouse.setName(name);
        repository.save(warehouse);
    }
}
