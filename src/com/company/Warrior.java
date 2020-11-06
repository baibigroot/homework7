package com.company;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String attackType, String name) {
        super(health, damage, attackType, name);
    }

    @Override
    public void SuperAbility(String SuperAbilityType) {
        System.out.println(getName() + " Primenil Magic & SuperPower " +
                SuperAbilityType);
    }
}
