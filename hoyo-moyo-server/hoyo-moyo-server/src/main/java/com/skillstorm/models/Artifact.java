package com.skillstorm.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artifacts")
public class Artifact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artifactId;
    private String name;
    private String description;
    private String set;
    private String piece;
    private int level;
    private int character_id;
    private String main_stat;
    
    public int getArtifactId() {
        return artifactId;
    }
    public void setArtifactId(int id) {
        this.artifactId = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSet() {
        return set;
    }
    public void setSet(String set) {
        this.set = set;
    }
    public String getPiece() {
        return piece;
    }
    public void setPiece(String piece) {
        this.piece = piece;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getCharacter_id() {
        return character_id;
    }
    public void setCharacter_id(int character_id) {
        this.character_id = character_id;
    }
    public String getMain_stat() {
        return main_stat;
    }
    public void setMain_stat(String main_stat) {
        this.main_stat = main_stat;
    }

    @Override
    public String toString() {
        return "Artifact [id=" + artifactId + ", name=" + name + ", description=" + description + ", set=" + set + ", piece="
                + piece + ", level=" + level + ", character_id=" + character_id + ", main_stat=" + main_stat + "]";
    }
}
