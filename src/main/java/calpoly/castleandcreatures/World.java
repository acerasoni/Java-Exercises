package calpoly.castleandcreatures;

import calpoly.castleandcreatures.entities.Castle;
import calpoly.castleandcreatures.entities.Player;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static calpoly.castleandcreatures.util.WorldParser.*;

/**
 * Write a program to play a simple "adventure"-style interactive game. The adventure world consists of up to five castles each of which has up to seven rooms (35 total). Each room has a treasure, worth a certain number of points, and a creature guarding the treasure. The treasure can be captured by bluffing or fighting the creature. Bluffing always has a 30% chance of succeeding. The odds for winning a fight vary from creature to creature. The object of the game is to visit different rooms and gain as many treasure points as possible. The player begins with 9 lives and each fight lost costs a life. (There's no penalty for losing a bluff.) When all the lives (or all treasures) are gone the game ends. The adventure world information (like castle and room names) is stored in a text file. The program must read the text file and create a data structure to represent the world. (HINT: Use a record structure for each room.) The program must handle interaction with the player, including display of menus for castle and room choices, display of current lives and treasure points accumulated, and responding to one-character commands to fight, bluff, or move around the world.
 */
public class World {

    private static final String filePath = "castlesAndCreaturesWorld.txt";
    private static World world;

    // Up to 5
    private List<Castle> castles;
    private Player player;
    private int[] map;

    public World() {
        castles = new ArrayList<>();
        player = new Player();
    }

    public void addCastle(Castle castle) {
        this.castles.add(castle);
    }

    public static void main(String... args) {
        readWorld();
        gameLoop();
        writeWorld();
    }

    private static void gameLoop() {
        System.out.printf("You have %s lives and %s points", world.player.getLives(), world.player.getPoints());

        System.out.println("This is the current map. 0 is ")
    }

    private static void readWorld() {
        Path path = FileSystems.getDefault().getPath(filePath);
        // Read the world from file
        try {
            String worldJson = Files.readString(path, StandardCharsets.US_ASCII);
            world = worldFromJson(worldJson);
        } catch (NoSuchFileException e) {
            // No save file exists
            world = freshWorld();
        } catch (IOException e) {
            // IO Error
            e.printStackTrace();
        }
    }

    private static void writeWorld() {
        // Write the content in file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            String worldJson = worldToJson(world);
            fileWriter.write(worldJson);
            fileWriter.close();
        } catch (IOException e) {
            // Exception handling
        }
    }
}
