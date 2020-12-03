package com.company.Game.Warriores;

import com.company.Game.Warrior;

public class Wizzard extends Warrior {

    private double armor = 0.8;
    private double strikerDamage = 0.2;

    public Wizzard(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String toString() {
        return "Wizzard";
    }

    @Override
    public int takeDamage(Warrior activePlayer) {
        activePlayer.setHealth((int) (activePlayer.getHealth() - activePlayer.getDamage() * strikerDamage));
        return (int) (activePlayer.getDamage() * armor);

    }


    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getStrikerDamage() {
        return strikerDamage;
    }

    public void setStrikerDamage(double strikerDamage) {
        this.strikerDamage = strikerDamage;
    }

}
