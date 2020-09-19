package calpoly.castleandcreatures.entities;

public class Player {


    private int lives = 9;
    private int points = 0;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
