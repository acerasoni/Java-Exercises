package calpoly.castleandcreatures.entities;

import java.util.List;

public class Player {
    private static final String OPTION_ERROR_MESSAGE = "Your action couldn't be identified. Type your action again.";

    //TODO: Increase to 9. Set to 1 for testing.
    private int lives = 9;

    private int points = 0;
    private List<Castle> castles;

    private Castle castle;
    private Room room;

    public void setCastles(List<Castle> castles) {
        this.castles = castles;
    }

    public int getLives() {
        return lives;
    }

    public int getPoints() {
        return points;
    }

    public String showPosition() {
        if (room != null) {
            return "in Room named " + room.getName();
        } else if (castle != null) {
            return "in Castle named " + castle.getName();
        } else {
            return "on the Road!";
        }
    }

    public String showOptions() {
        if (room != null) {
            return "1. Return to Castle " + castle.getName() + " by typing 1" + "\n2. Return to Road by typing 2\n3. Bluff the creature (30% success chance) by typing 3\n4. Fight the creature (" + room.getCreature().getSuccessRate() + "% success chance) by typing 4" + "\n5. Exit game by typing Q";
        } else if (castle != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("1. Enter one of the Rooms by typing its name:");
            for (int i = 0; i < castle.getRooms().size(); i++) {
                sb.append("\n\t" + castle.getRooms().get(i).getName());
            }
            sb.append("\n2. Return to Road by typing 2");
            sb.append("\n3. Exit game by typing Q");
            return sb.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("1. Enter one of the Castles by typing its name:");
            for (int i = 0; i < castles.size(); i++) {
                sb.append("\n\t" + castles.get(i).getName());
            }

            sb.append("\n2. Exit game by typing Q");
            return sb.toString();
        }
    }

    public Boolean act(String action) {
        if (action.equals("Q")) {
            // Exit game
            return null;
        }

        if (room != null) {
            if (action.equals("1")) {
                room = null;
                return true;
            } else if (action.equals("2")) {
                castle = null;
                room = null;
                return true;
            } else if (action.equals("3") || action.equals("4")) {
                if (action.equals("3")) {
                    bluff(room);
                } else {
                    fight(room);
                }
                castle.removeRoom(room);
                room = null;
                if (castle.getRooms().size() == 0) {
                    castles.remove(castle);
                    castle = null;
                }

                return true;
            } else {
                return false;
            }
        } else if (castle != null) {
            if (action.equals("2")) {
                castle = null;
                return true;
            } else {
                for (int i = 0; i < castle.getRooms().size(); i++) {
                    Room r = castle.getRooms().get(i);
                    if (r.getName().equals(action)) {
                        room = r;
                        return true;
                    }
                }
                System.out.println(OPTION_ERROR_MESSAGE);
                return false;
            }
        } else {
            for (int i = 0; i < castles.size(); i++) {
                Castle c = castles.get(i);
                if (c.getName().equals(action)) {
                    castle = c;
                    return true;
                }
            }
            System.out.println(OPTION_ERROR_MESSAGE);
            return false;
        }
    }

    private void bluff(Room room) {
        if (room.getCreature().bluff()) {
            points += room.getTreasure().getPoints();
            System.out.println("You successfully bluffed the creature! The room collapsed under its own weight, but you managed to snatch the treasure just in time.");
        } else {
            System.out.println("You tried to bluff the creature and you failed. It ran away with the treasure, and the room collapsed under its own weight!");
        }
    }

    private void fight(Room room) {
        if (room.getCreature().fight()) {
            points += room.getTreasure().getPoints();
            System.out.println("You successfully defeated the creature! The room collapsed under its own weight, but you managed to snatch the treasure just in time.");
        } else {
            System.out.println("The creature defeated you, bringing your lives down to " + --lives + ". It ran away with the treasure, and the room collapsed under its own weight!");
        }
    }

}
