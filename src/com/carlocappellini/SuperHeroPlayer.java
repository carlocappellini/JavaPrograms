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

    public void takeDamage(int damage) {
        this.health = this.health - damage;
        if (this.health == 0) {
            System.out.println("player Knockout");
        }
        System.out.println(this.health);
    }


    private void lifeUp(int health) {

        if (this.health > 0 && this.health <= 100) {
            this.health = health;
            System.out.println("Health went up");
        }
    }

    public void eatRation() {

        int ration = 50;
        this.health = this.health + ration;

        System.out.println("eating Ration");
        lifeUp(ration);
        System.out.println(health);
    }

    public boolean maxRage() {
        int maxRage = 1000;
        System.out.println("MAX RAGE REACHED" + maxRage + "  !!!!!! GRRR USING " + weapon + " TO DESTROY ");
        return true;

    }


    private void shootFire(int fire) {

        int count = 0;
        while (fire > 5){
            count ++;
            System.out.println("Shooting " + count + " fireballs");
            break;
        }
        if (maxRage()){
            System.out.println("SUPER FIREBALL CREATED");

        }
    }

    private void lowHealth() {
        if (this.health <= 10) {
            maxRage();


        }
    }
}

