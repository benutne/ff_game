package com.butne;

import java.io.Console;
import com.butne.Character;

public class Main {

    public static void main(String[] args) {

        Character testChar = new Character();
        testChar.setName("Bendarr");
        testChar.setAttack(new int[]{1, 2, 3});
        testChar.setIntelligence(new int[]{1, 2, 3});
        testChar.setSkill(new int[]{1, 2, 3});
        testChar.setMind(new int[]{1, 2, 3});
        testChar.setMaxHealth(30);
        testChar.setCurrentHealth(30);
        testChar.setMaxMana(15);
        testChar.setCurrentMana(15);

        testChar.equipmentSlot[0] = new Equipment("Iron Sword");
        //testChar.equipmentSlot[0].
        int i [] = testChar.returnCurrentAttack();
    }
}
