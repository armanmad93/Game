package com.company.Game;

public abstract class Warrior {

    private String name;
    private int health;
    private int damage;

    public Warrior(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Warrior warrior, Warrior activePlayer) {
        warrior.setHealth(warrior.getHealth() - warrior.takeDamage(activePlayer));
    }

    public int takeDamage(Warrior activePlayer) {
        return activePlayer.getDamage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
