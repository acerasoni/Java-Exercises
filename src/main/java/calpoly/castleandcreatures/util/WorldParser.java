package calpoly.castleandcreatures.util;

import calpoly.castleandcreatures.World;
import calpoly.castleandcreatures.entities.Castle;
import calpoly.castleandcreatures.entities.Creature;
import calpoly.castleandcreatures.entities.Room;
import calpoly.castleandcreatures.entities.Treasure;
import com.google.gson.Gson;

import static calpoly.castleandcreatures.util.Names.getRandomName;

/**
 * This class is responsible for parsing JSON objects and into world object. It is also responsible for creating fresh World objects.
 */
public class WorldParser {

    public static World worldFromJson(String json) {
        return new Gson().fromJson(json, World.class);
    }

    public static String worldToJson(World world) {
        return new Gson().toJson(world);
    }

    public static World freshWorld() {
        World world = new World();

        // Up to 5 castles
        for(int castleNumber = getRandomNumber(0, 5); castleNumber >= 0; castleNumber--) {
            Castle castle = new Castle(getRandomName());

            // Up to 7 rooms
            for(int roomNumber = getRandomNumber(0, 7); roomNumber >= 0; roomNumber--) {
                // Treasure worth up to 100 points
                Treasure treasure = new Treasure(getRandomNumber(0, 100));

                // Creature with random strength up to 50
                Creature creature = new Creature(getRandomNumber(0, 50));

                castle.addRoom(new Room(treasure, creature, getRandomName()));
            }

            world.addCastle(castle);
        }

        return world;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
