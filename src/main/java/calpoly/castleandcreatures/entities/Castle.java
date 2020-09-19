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

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }
}
