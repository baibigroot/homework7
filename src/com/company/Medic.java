package com.company;

public class Medic extends Hero {


    public Medic(int health, int damage, String attackType, String name) {
        super(health, damage, attackType, name);
    }

    @Override
    public void SuperAbility(String SuperAbilityType) {
        System.out.println(getName() +
                " Primenil Super power: " + SuperAbilityType);
    }
}
