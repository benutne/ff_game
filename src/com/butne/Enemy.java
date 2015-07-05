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

    /*
        These stats are represented as an array since we have three different stats, one for each
        set of "dice": Green, Blue, Red
    */

    protected int attack [] = new int[3];
    protected int skill [] = new int[3];
    protected int intelligence[] = new int[3];
    protected int mind [] = new int[3];

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
}
