package com.carlocappellini;

public class FastCar extends Car2 {
    private int speed;
    private boolean turbo;
    private String model;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public FastCar(int wheels, int doors, String color, int speed, boolean turbo, String model) {
        super(wheels, doors, color);
        this.speed = speed;
        this.turbo = turbo;
        this.model = model;
        System.out.println("FastCar created");

    }

    private void goesTurbo(int speed) {
        this.speed = speed;
        System.out.println("FastCar is Going turbo at" + this.speed + " mph");

    }


    public void velocity(int gear) {
        switch (gear) {

            case 1:
                this.speed = 30;
                System.out.println("at gear " + gear + " speed is at " + this.speed);
                break;
            case 2:
                this.speed = 50;
                System.out.println("at gear " + gear + " speed is at " + this.speed);
                break;

            case 3:
                this.speed = 70;
                System.out.println("at gear " + gear + " speed is at " + this.speed);
                break;

            case 4:
                this.speed = 95;
                System.out.println("at gear " + gear + " speed is at " + this.speed);
                break;

            case 5:
                this.speed = 120;
                System.out.println("at gear " + gear + " speed is at " + this.speed);
                break;

            case 6:
                this.speed = 160;
                goesTurbo(this.speed += 50);
                System.out.println("at gear " + gear + " speed is at " + this.speed);
                break;

        }

    }


}
