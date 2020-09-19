package calpoly.castleandcreatures.entities;

import calpoly.castleandcreatures.World;

public class Room {

    private String name;
    private Treasure treasure;
    private Creature creature;

    public Room(Treasure treasure, Creature creature, String name) {
        this.treasure = treasure;
        this.creature = creature;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }
}
