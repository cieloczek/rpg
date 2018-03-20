import java.util.Scanner;

public class Skeleton extends Monster {

    public Skeleton(String name, int basicHealth, String lightAttack, String heavyAttack) {
        super(name, basicHealth, 20, 3, lightAttack, heavyAttack);
    }
}
//    private String name;
//    private int basicHealth;
//    private int currentHealth;
//    private int defence;
//    private int numOfAttacks;
//    private int option;
//
//    public Skeleton(String name, int basicHealth, int currentHealth, int defence, int numOfAttacks) {
//        this.name = name;
//        this.basicHealth = basicHealth;
//        this.currentHealth = currentHealth;
//    }
//
//    @Override
//    public int getBasicHealth() {
//        return basicHealth;
//    }
//
//    @Override
//    public int getDefence() {
//        return defence;
//    }
//
//    @Override
//    public int attack(Scanner sc) {
//        int dmg=0;
//          //while(option==1 || option==2){
//        do {
//            System.out.println("1. Light attack (1A) \n2. Heavy Attack(2A)");
//            option = sc.nextInt();
//        }while(option!=1 && option !=2);
//        switch (option) {
//                case 1:
//                    dmg = meleeAttack();
//                    System.out.println("Attack " + dmg);
//                    break;
//                case 2:
//                    dmg = heavyAttack();
//                    System.out.println("Attack " + dmg);
//                    break;
//            }
//
//        System.out.println("Out the attack loop " + dmg);
//        return dmg;
//    }
//
//    @Override
//    public void setCurrentHealth(int health) {
//        this.currentHealth=health;
//    }
//
//    @Override
//    public int getCurrentHealth() { return currentHealth;
//    }
//
//    @Override
//    public int action(Scanner sc) {
//        int x = 0;
//        do {
//            System.out.println("1. Attack \n2. Flee ");
//            option = sc.nextInt();
//        }
//         while (option<1 && option >2 );
//            switch (option) {
//                case 1:
//                    x = attack(sc);
//                    System.out.println("Action " + x);
//                    option =0;
//                    break;
//                case 2:
//                    flee();
//                    option=0;
//                    break;
//        }while(option !=0);
//        System.out.println(" out the loop ");
//        return x;
//    }
//    private int meleeAttack(){
//        Dice dice = new Dice("1k10");
//        int dmg = dice.roll();
//        System.out.println("Dice " + dmg);
//        return dmg;
//    }
//    private int heavyAttack(){
//        Dice dice = new Dice("3k12");
//        int dmg = dice.roll();
//        System.out.println("Dice " +dmg);
//        return dmg;
//    }
//    private void flee() {
//
//    }
//}
