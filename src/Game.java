import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    static Player[] playerList = new Player[2];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        playerList[0] = new Player("Mateusz");
        playerList[1] = new Player("Test");
        int option;
        gamePlay(sc, playerList);

// TODO create fight system
//TODO creating player
// TODO create player scorelist
    }

    private static void gamePlay(Scanner sc, Player[] playerList) {
        boolean gameIsOn = true;
        int tour = ThreadLocalRandom.current().nextInt(2);
        while (gameIsOn) {
            if (tour % 2 == 0) {
                System.out.println("tour : " + tour);
                Player attackingPlayer = playerList[0];
                Player defendingPlayer = playerList[1];
                System.out.println(playerList[0] + " turn");
                battle(sc, attackingPlayer, defendingPlayer);
                tour++;
                System.out.println("tour : " + tour);

            } else {
                System.out.println("tour : " + tour);
                Player defendingPlayer = playerList[0];
                Player attackingPlayer = playerList[1];
                System.out.println(playerList[1] + " turn");
                battle(sc, attackingPlayer, defendingPlayer);
                tour++;
                System.out.println("tour : " + tour);
            }
        }
    }
//TODO finish input verification
    private static void battle(Scanner sc, Player attackingPlayer, Player defendingPlayer) {
        int action = 0;
        boolean isValid = false;
        do {
            System.out.println("1. Attack \n2. Flee");
            String tmp = sc.next();
            try {
                action = Integer.parseInt(tmp);
                if (action >= 2 || action <= 1) {
                    isValid = true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Enter a number");
            }
        } while (!isValid);
        switch (action) {
            case 1:
                int dmg = attack(sc, attackingPlayer);
                System.out.println(dmg);
                dealDmg(dmg, defendingPlayer);
                break;
            case 2:
                run();
                break;
        }
    }

    private static int attack(Scanner sc, Player player) {
        return player.playerAction(sc);
    }

    private static boolean run() {
        return false;
    }

    private static void dealDmg(int dmg, Player defendingPlayer) {
        int currentHp = defendingPlayer.getHero().getCurrentHealth();
        int currDef = defendingPlayer.getHero().getDefence();
        int temp = dmg - currDef;
        if (temp > 0) {
            defendingPlayer.getHero().setCurrentHealth(currentHp - temp);
            System.out.println("Dealt :  " + temp + " dmg");
        } else {
            System.out.println("Defence not broken");
        }
    }
}
