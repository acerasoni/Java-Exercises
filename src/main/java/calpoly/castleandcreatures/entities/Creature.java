package calpoly.castleandcreatures.entities;

import static calpoly.castleandcreatures.util.WorldParser.getRandomNumber;

public class Creature {

    private int strength;

    public Creature(int strength) {
        this.strength = strength;
    }

    public boolean bluff() {
        // 30% chance of winning
        return getRandomNumber(1, 100) <= 30 ? true : false;
    }

    public boolean fight() {
        // Odds determined by strength
        return getRandomNumber(1, 100) <= strength ? true : false;
    }
}
