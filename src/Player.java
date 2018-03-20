import java.awt.*;
import java.util.Scanner;

public class Player {
    Skeleton skeleton = new Skeleton("Test",100,100,10,1);
    private String name;
    private int score = 0;
    private Creature hero;
    public Player(String name) {
        this.name = name;
        this.score = score;
        this.hero=skeleton;
    }

    public Creature getHero() {
        return hero;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public Player createPlayer() {
        return new Player(name);
    }
    public void victory(){
        score++;
    }
    public int playerAction(Scanner sc){
        return hero.action(sc);
    }
}
