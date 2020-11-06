package com.company;

public abstract class Hero implements HavingSuperAbility{
    int Health;
    int Damage;
    String AttackType;
    String name;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getAttackType() {
        return AttackType;
    }

    public void setAttackType(String attackType) {
        AttackType = attackType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero(int health, int damage, String attackType, String name) {
        Health = health;
        Damage = damage;
        AttackType = attackType;
        this.name = name;
    }
}
