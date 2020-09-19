package calpoly.castleandcreatures.entities;

import java.util.ArrayList;
import java.util.List;

public class Castle {

    // Up to 5
    private List<Room> rooms;
    private String name;

    public Castle(String name) {
        this.rooms = new ArrayList<>();
        this.name = name;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }
}
