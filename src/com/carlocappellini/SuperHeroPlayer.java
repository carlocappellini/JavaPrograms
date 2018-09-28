package com.carlocappellini;

public class SuperHeroPlayer {

    private String name;
    private String weapon;
    private String superPower;
    private int health = 100;
    private int rageMeter = 0;


    public SuperHeroPlayer(int rageMeter) {
        this.rageMeter = rageMeter;
    }


    public SuperHeroPlayer(String name, String weapon, String superPower, int health) {
        this.name = name;
        this.weapon = weapon;
        this.superPower = superPower;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public int getRageMeter() {
        return rageMeter;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void getHealth() {

        System.out.println(health);
    }


    public void takeEnemyDamage(int enemyDamage) {
        this.health = health - enemyDamage;
        System.out.println(health);
        if (this.health <= 10) {
            powerUpWhenHealthIsLow();
        } else if (this.health % 10 == 0 && this.health == 0) {
            System.out.println("player Knockout, health = " + this.health);

        } else {
            System.out.println("damage taken " + enemyDamage + " health remaining " + this.health);
        }
    }

    private void powerUpWhenHealthIsLow() {
        int extraTempLife = 500;
        int powerUpSeconds = 15;
        powerUp();
        this.health = health + extraTempLife;
        System.out.println("Temporary health reached " + this.health);

        for (int i = 1; i <= powerUpSeconds; i++) {
            System.out.println(i);
        }
        System.out.println("Rage time reached");
        this.health = 20;
        this.rageMeter = 0;
        System.out.println("back to normal health = " + this.health + " Rage = " + this.rageMeter);


    }

    private boolean activateStreak(boolean activation) {
        maxRage(true);
        return activation;
    }


    public void foundRageBooster() {
        System.out.println("found Rage Booster");
        addRageBooster();
    }

    private void addRageBooster() {
        int booster = 20;
        int rageAtLimit = 100;

        if (this.rageMeter + booster <= rageAtLimit) {
            this.rageMeter = rageMeter + booster;

            System.out.println("Boost acquired " + this.rageMeter);

        } else {
            System.out.println(this.rageMeter);
            activateStreak(true);
            this.rageMeter = 0;

        }
    }


    private void lifeUp() {
        System.out.println("Health went up to " + this.health);
    }

    public void eatRation() {
        int ration = 50;
        int currMaxHealth = 200;

        if (this.health < currMaxHealth && this.health >= 1) {
            System.out.println("eating Ration +" + ration + " health points");
            this.health = health + ration;
            lifeUp();
        } else {
            currentMaxHealth();
        }
    }


    private void currentMaxHealth() {
        System.out.println("Max Health is 200 cant go any higher, level up ");
    }


    private boolean maxRage(boolean rage) {
        System.out.println("MAX RAGE REACHED " + (this.rageMeter = 1000) + "  !!!!!! GRRR USING " + weapon + " TO DESTROY ");
        return rage;
    }

    private void powerUp() {
        System.out.println("Power up Activated");
        maxRage(true);
    }


    public void shootFire(int fire) {

        int count = 0;
        while (true) {
            if (fire <= 5) {
                for (int i = 1; i <= fire; i++) {
                    count++;
                    System.out.println("Shooting " + count + " fireballs");
                }
                System.out.println("explosion......");

            } else {
                System.out.println("can only throw between 1 and 5 fireballs");
            }

            break;
        }

    }

    private void lowHealth() {
        if (this.health <= 10) {
            maxRage(true);


        }
    }
}

