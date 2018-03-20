import java.util.Scanner;

public abstract class Monster implements Creature {
    protected String name;
    protected int basicHealth;
    protected int currentHealth;
    protected int defence;
    protected int numOfAttacks;
    protected int option;
    protected String lightAttack;
    protected String heavyAttack;

    public Monster(String name, int basicHealth, int defence, int numOfAttacks, String lightAttack, String heavyAttack) {
        this.name = name;
        this.basicHealth = basicHealth;
        this.currentHealth = currentHealth;
        this.lightAttack = lightAttack;
        this.heavyAttack = heavyAttack;
    }

    @Override
    public int getBasicHealth() {
        return basicHealth;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public int attack(Scanner sc) {
        int dmg=0;
          //while(option==1 || option==2){
        do {
            System.out.println("1. Light attack (1A) \n2. Heavy Attack(2A)");
            option = sc.nextInt();
        }while(option!=1 && option !=2);
        switch (option) {
                case 1:
                    dmg = meleeAttack();
                    System.out.println("Attack " + dmg);
                    break;
                case 2:
                    dmg = heavyAttack();
                    System.out.println("Attack " + dmg);
                    break;
            }

        System.out.println("Out the attack loop " + dmg);
        return dmg;
    }

    @Override
    public void setCurrentHealth(int health) {
        this.currentHealth=health;
    }

    @Override
    public int getCurrentHealth() { return currentHealth;
    }

    @Override
    public int action(Scanner sc) {
        int x = 0;
        do {
            System.out.println("1. Attack \n2. Flee ");
            option = sc.nextInt();
        }
         while (option<1 && option >2 );
            switch (option) {
                case 1:
                    x = attack(sc);
                    System.out.println("Action " + x);
                    option =0;
                    break;
                case 2:
                    flee();
                    option=0;
                    break;
        }while(option !=0);
        System.out.println(" out the loop ");
        return x;
    }
    protected int meleeAttack(){
        Dice dice = new Dice(lightAttack);
        int dmg = dice.roll();
        System.out.println("Dice " + dmg);
        return dmg;
    }
    protected int heavyAttack(){
        Dice dice = new Dice(heavyAttack);
        int dmg = dice.roll();
        System.out.println("Dice " +dmg);
        return dmg;
    }
    protected void flee() {
    }
}
