package com.butne;

import javax.swing.plaf.synth.Region;

/**
Character class
 */
public class Character {

/*    Here are our basic character stats.  */

    protected String name;
    protected String characterType;
    protected int level;
    protected String [] characterAbilities;
    protected int maxHealth;
    protected int currentHealth;
    protected int maxMana;
    protected int currentMana;

// <editor-fold desc="Get and set funtions for above stats">

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

    //</editor-fold>

/*    These stats are represented as an array since we have three different stats, one for each
    set of "dice": Green, Blue, Red
*/


    protected int attack [] = new int[3];
    protected int skill [] = new int[3];
    protected int intelligence[] = new int[3];
    protected int mind [] = new int[3];

// <editor-fold desc="Get and set funtions for above stats">


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
// </editor-fold>

/*    The equipment element is considered an array of four items since we can have up to four pieces of
    equipment on a character at any given time.
*/

    protected Equipment equipmentSlot [] = new Equipment[4];

/*
    This function calculates attack including bonuses from equipment.
*/

    public int [] returnCurrentAttack() {
        int r_attackTotal [] = new int [3];
        int baseAttack [] = getAttack();
        int attackBonus [] = calculateAttackEquipmentBonus();
        for (int i = 0; i < r_attackTotal.length; i++) {
            r_attackTotal[i] = baseAttack[i] + attackBonus[i];
        }
        return r_attackTotal;
    }

/*
    This function adds up all the attack bonuses from equipment into a single array of three numbers.
*/

    protected int [] calculateAttackEquipmentBonus(){
        int [] r_attackBonus = new int [3];

        for (Equipment iter_equip : this.equipmentSlot){
        r_attackBonus[0] = iter_equip.attack[0] + r_attackBonus[0];
        r_attackBonus[1] = iter_equip.attack[1] + r_attackBonus[1];
        r_attackBonus[2] = iter_equip.attack[2] + r_attackBonus[2];
        }

        return r_attackBonus;
    }

/*
    This function calculates skill including bonuses from equipment.
*/

    public int [] returnCurrentSkill() {
        int r_skillTotal [] = new int [3];
        int baseSkill [] = getSkill();
        int skillBonus [] = calculateSkillEquipmentBonus();
        for (int i = 0; i < r_skillTotal.length; i++) {
            r_skillTotal[i] = baseSkill[i] + skillBonus[i];
        }
        return r_skillTotal;
    }

/*
    This function adds up all the skill bonuses from equipment into a single array of three numbers.
*/

    protected int [] calculateSkillEquipmentBonus(){
        int [] r_skillBonus = new int [3];

        for (Equipment iter_equip : this.equipmentSlot){
            r_skillBonus[0] = iter_equip.skill[0] + r_skillBonus[0];
            r_skillBonus[1] = iter_equip.skill[1] + r_skillBonus[1];
            r_skillBonus[2] = iter_equip.skill[2] + r_skillBonus[2];
        }

        return r_skillBonus;
    }

/*
    This function calculates intelligence including bonuses from equipment.
*/

    public int [] returnCurrentIntelligence() {
        int r_intelligenceTotal [] = new int [3];
        int baseIntelligence [] = getIntelligence();
        int intelligenceBonus [] = calculateIntelligenceEquipmentBonus();
        for (int i = 0; i < r_intelligenceTotal.length; i++) {
            r_intelligenceTotal[i] = baseIntelligence[i] + intelligenceBonus[i];
        }
        return r_intelligenceTotal;
    }

/*
    This function adds up all the intelligence bonuses from equipment into a single array of three numbers.
*/

    protected int [] calculateIntelligenceEquipmentBonus(){
        int [] r_intelligenceBonus = new int [3];

        for (Equipment iter_equip : this.equipmentSlot){
            r_intelligenceBonus[0] = iter_equip.intelligence[0] + r_intelligenceBonus[0];
            r_intelligenceBonus[1] = iter_equip.intelligence[1] + r_intelligenceBonus[1];
            r_intelligenceBonus[2] = iter_equip.intelligence[2] + r_intelligenceBonus[2];
        }

        return r_intelligenceBonus;
    }

/*
    This function calculates intelligence including bonuses from equipment.
*/

    public int [] returnCurrentMind() {
        int r_mindTotal [] = new int [3];
        int baseMind [] = getMind();
        int mindBonus [] = calculateMindEquipmentBonus();
        for (int i = 0; i < r_mindTotal.length; i++) {
            r_mindTotal[i] = baseMind[i] + mindBonus[i];
        }
        return r_mindTotal;
    }

/*
    This function adds up all the intelligence bonuses from equipment into a single array of three numbers.
*/

    protected int [] calculateMindEquipmentBonus(){
        int [] r_mindBonus = new int [3];

        for (Equipment iter_equip : this.equipmentSlot){
            r_mindBonus[0] = iter_equip.mind[0] + r_mindBonus[0];
            r_mindBonus[1] = iter_equip.mind[1] + r_mindBonus[1];
            r_mindBonus[2] = iter_equip.mind[2] + r_mindBonus[2];
        }

        return r_mindBonus;
    }

}
