package com.skillstorm.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Warehouse;
import com.skillstorm.services.WarehouseService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/warehouses")
@CrossOrigin(origins = "http://localhost:5173")
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @GetMapping
    public Iterable<Warehouse> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> findById(@PathVariable int id) {
        Optional<Warehouse> warehouse = service.findById(id);
        if (warehouse.isPresent()) {
            return ResponseEntity.ok(warehouse.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Warehouse create(@Valid @RequestBody Warehouse warehouse) {
        return service.save(warehouse);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }

    @PutMapping("/{id}/{name}")
    public void updateWarehouseById(@PathVariable int id, @PathVariable String name, @RequestBody Warehouse entity) {
        service.updateWarehouseById(id, name, entity);
    }
}
