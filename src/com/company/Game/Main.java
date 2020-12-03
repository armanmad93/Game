package com.company.Game;

import com.company.Game.Warriores.Archer;
import com.company.Game.Warriores.Swordsman;
import com.company.Game.Warriores.Wizzard;

public class Main {

    public static void main(String[] args) {

        Archer archer = new Archer("archer", 1000, 100);
        Swordsman swordsman = new Swordsman("swordsman", 2000, 50);
        Wizzard wizzard = new Wizzard("wizzard", 500, 200);

        Battles battles = new Battles();

        battles.battle(archer,wizzard);

    }

}
