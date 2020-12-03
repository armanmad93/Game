package com.company.Game.Warriores;

import com.company.Game.Warrior;

public class Archer extends Warrior {

    private int criticalDamage = 2;
    private int count = 0;

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String toString() {
        return "Archer";
    }

    @Override
    public void attack(Warrior warrior, Warrior activePlayer) {
        count++;
        boolean bool = true;
        if (count % 3 == 0) {
            bool = false;
            warrior.setHealth(warrior.getHealth() - warrior.takeDamage(activePlayer) * criticalDamage);
        }
        if (bool) {
            warrior.setHealth(warrior.getHealth() - warrior.takeDamage(activePlayer));
        }
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }
}

