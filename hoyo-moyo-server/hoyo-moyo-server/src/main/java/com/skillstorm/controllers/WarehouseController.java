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

import com.skillstorm.models.Warehouse;
import com.skillstorm.services.WarehouseService;

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

    //TODO: create new warehouse
    //TODO: Update warehouse
    //TODO: delete warehouse

}
