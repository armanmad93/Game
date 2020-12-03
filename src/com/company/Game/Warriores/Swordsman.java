package com.company.Game.Warriores;

import com.company.Game.Warrior;

public class Swordsman extends Warrior {

    private double armor = 0.8;

    public Swordsman(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String toString() {
        return "Swordsman";
    }

    @Override
    public int takeDamage(Warrior activePlayer) {

        return (int) (activePlayer.getDamage() * armor);

    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }
}
