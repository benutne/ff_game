package com.butne;

/**
Character class
 */
public class Character {

    protected String name;
    protected String characterType;
    protected int level;
    protected String [] characterAbilities;
    protected int maxHealth;
    protected int currentHealth;
    protected int maxMana;
    protected int currentMana;


/*    These stats are represented as an array since we have three different stats, one for each
    set of "dice": Green, Blue, Red*/


    protected int attack [] = new int[3];
    protected int skill [] = new int[3];
    protected int intelligence[] = new int[3];
    protected int mind [] = new int[3];

/*    Get/Set Functions for above stats*/

    public int[] getAttack() {
        return attack;
    }

    public void setAttack(int[] attack) {
        this.attack = attack;
    }

    public int[] getSkill() {
        return skill;
    }

    public void setSkill(int[] skill) {
        this.skill = skill;
    }

    public int[] getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int[] intelligence) {
        this.intelligence = intelligence;
    }

    public int[] getMind() {
        return mind;
    }

    public void setMind(int[] mind) {
        this.mind = mind;
    }


/*    The equipment element is considered an array of four items since we can have up to four pieces of
    equipment on a character at any given time.  */

    protected Equipment equipmentSlot [] = new Equipment[4];

    //Functions for calculating current stats like attack, skill, intelligence, and mind

    public int [] returnCurrentAttack() {
        int r_attack [] = new int [3];
        int baseAttack [] = getAttack();
        return r_attack;
    }

    protected int [] calculateAttackEquipmentBonus(){
        int [] r_attackBonus = new int [3];

        return r_attackBonus;
    }

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

    public String[] getCharacterAbilities() {
        return characterAbilities;
    }

    public void setCharacterAbilities(String[] characterAbilities) {
        this.characterAbilities = characterAbilities;
    }
}
