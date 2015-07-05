package com.butne;

/**
Enemy class
 */
public class Enemy {
    protected String name;
    protected String enemyType;
    protected int maxHealth;
    protected int currentHealth;
    protected int expAwarded;
    protected int gpAwarded;
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

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
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

    public int getExpAwarded() {
        return expAwarded;
    }

    public void setExpAwarded(int expAwarded) {
        this.expAwarded = expAwarded;
    }

    public int getGpAwarded() {
        return gpAwarded;
    }

    public void setGpAwarded(int gpAwarded) {
        this.gpAwarded = gpAwarded;
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
}
