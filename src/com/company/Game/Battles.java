package com.company.Game;

public class Battles {

    public void battle(Warrior firstWarrior, Warrior secondWarrior) {

        boolean bool = true;

        while (true) {

            if (bool) {
                System.out.println(firstWarrior + " hit " + secondWarrior + ".");
                firstWarrior.attack(secondWarrior, firstWarrior);
                System.out.println(secondWarrior + " health: " + secondWarrior.getHealth());
                System.out.println();
                bool = false;
            } else {
                System.out.println(secondWarrior + " hit " + firstWarrior + ".");
                secondWarrior.attack(firstWarrior, secondWarrior);
                System.out.println(firstWarrior + " health:" + firstWarrior.getHealth());
                System.out.println();
                bool = true;
            }

            if (firstWarrior.getHealth() <= 0) {
                System.out.println(secondWarrior + " win.");
                System.out.println("Game Over!");
                System.out.println();
                break;
            } else if (secondWarrior.getHealth() <= 0) {
                System.out.println(firstWarrior + " win.");
                System.out.println("Game Over!");
                System.out.println();
                break;
            }

        }

    }
}
