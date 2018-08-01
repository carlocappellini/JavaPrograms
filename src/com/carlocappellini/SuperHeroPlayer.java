package com.carlocappellini;

public class SuperHeroPlayer {

    private String name;
    private String weapon;
    private String superPower;
    private int health;

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getHealth() {
        return health;
    }

    public SuperHeroPlayer(String name, String weapon, String superPower, int health) {
        this.name = name;
        this.weapon = weapon;
        this.superPower = superPower;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void takeEnemyDamage(int enemyDamage) {


        this.health = this.health - enemyDamage;
        System.out.println(this.health);
        if (this.health == 10) {
            powerUpWhenHealthIsLow();
        }
        else if (this.health % 10 == 0 && this.health == 0) {
            System.out.println("player Knockout, health = " + this.health);

        } else {
            System.out.println("damage taken " + enemyDamage + " health remaining " + this.health);
        }


    }

    private void powerUpWhenHealthIsLow() {
        int extraTempLife = 500;
        int powerUpSeconds = 15;

        powerUp();
        this.health = this.health + extraTempLife;
        System.out.println("Temporary health reached " + this.health);

        for (int i = 0; i != powerUpSeconds; i++) {
            System.out.println(i);
        }
        System.out.println(powerUpSeconds + " reached");
        this.health = 10;
        System.out.println("back to normal " + this.health);


    }


    private void lifeUp() {
        System.out.println("Health went up");
        System.out.println(this.health);

    }

    public void eatRation() {
        int ration = 50;
        System.out.println("eating Ration +" +ration);
        this.health = this.health + ration;
        lifeUp();
    }

    public boolean maxRage(boolean rage) {
        int maxRage = 1000;
        System.out.println("MAX RAGE REACHED " + maxRage + "  !!!!!! GRRR USING " + weapon + " TO DESTROY ");
        return rage;


    }

    public void powerUp() {
        System.out.println("Power up Activated");
        maxRage(true);


    }


    private void shootFire(int fire) {

        int count = 0;
        while (fire > 5) {
            count++;
            System.out.println("Shooting " + count + " fireballs");
            break;
        }
        if (maxRage(true)) {
            System.out.println("SUPER FIREBALL CREATED");

        }
    }

    private void lowHealth() {
        if (this.health <= 10) {
            maxRage(true);


        }
    }
}

