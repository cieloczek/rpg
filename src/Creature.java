import java.util.Scanner;

public interface Creature {
    int getBasicHealth();
    int getDefence();
    int attack(Scanner sc);
    void setCurrentHealth(int health);
    int getCurrentHealth();
    int action(Scanner sc);
}
