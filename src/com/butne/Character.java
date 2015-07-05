package com.butne;

/**
Character class
 */
public class Character {

    protected String name;
    protected int level;
    protected String characterType;
    protected String [] characterAbilities;
    protected int maxHealth;
    protected int currentHealth;
    protected int maxMana;
    protected int currentMana;
    protected int attack;
    protected int skill;
    protected int intellignence;
    protected int mind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getIntellignence() {
        return intellignence;
    }

    public void setIntellignence(int intellignence) {
        this.intellignence = intellignence;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public String[] getCharacterAbilities() {
        return characterAbilities;
    }

    public void setCharacterAbilities(String[] characterAbilities) {
        this.characterAbilities = characterAbilities;
    }
}
