package calpoly.castleandcreatures.entities;

public class Room {

    private String name;
    private Treasure treasure;
    private Creature creature;

    public Room(Treasure treasure, Creature creature, String name) {
        this.treasure = treasure;
        this.creature = creature;
        this.name = name;
    }
}
