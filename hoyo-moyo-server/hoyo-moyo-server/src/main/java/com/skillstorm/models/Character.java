package com.skillstorm.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int characterId; 
    private String name;
    private int level;
    private String description;
    private String element;
    //private Weapon equippedWeapon;
    private int hp;
    private int atk;
    private int def;

    public int getCharacterId() {
        return characterId;
    }
    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }
    public String getName() {
        return name;
    }
    public void setName(String characterName) {
        this.name = characterName;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int characterLevel) {
        this.level = characterLevel;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String characterDescription) {
        this.description = characterDescription;
    }
    public String getElement() {
        return element;
    }
    public void setElement(String characterElement) {
        this.element = characterElement;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int characterHp) {
        this.hp = characterHp;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int characterAtk) {
        this.atk = characterAtk;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int characterDef) {
        this.def = characterDef;
    }

    @Override
    public String toString() {
        return "Character [characterId=" + characterId + ", characterName=" + name + ", characterLevel="
                + level + ", characterDescription=" + description + ", characterElement="
                + element + ", characterHp=" + hp + ", characterAtk=" + atk
                + ", characterDef=" + def + "]";
    }

    
}
