package com.company;

public class Magic extends Hero {

    public Magic(int health, int damage, String attackType, String name) {
        super(health, damage, attackType, name);
    }

    @Override
    public void SuperAbility(String SuperAbilityType) {
        System.out.println(getName() + " Karlygach numberOne " +
                SuperAbilityType);

    }
}
