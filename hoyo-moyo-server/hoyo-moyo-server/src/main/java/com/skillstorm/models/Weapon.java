package com.skillstorm.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "weapons")
public class Weapon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int weaponId;
    private String name;
    private String type;
    private String description;
    private int character_id;
    private int level;
    
    public int getWeaponId() {
        return weaponId;
    }
    public void setWeaponId(int id) {
        this.weaponId = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getCharacter_id() {
        return character_id;
    }
    public void setCharacter_id(int character_id) {
        this.character_id = character_id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Weapon [id=" + weaponId + ", name=" + name + ", type=" + type + ", description=" + description
                + ", character_id=" + character_id + ", level=" + level + "]";
    }
}
