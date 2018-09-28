package com.carlocappellini;

public class Vehicle {

    private int wheels;
    private int doors;
    private String color;


    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }


    public String getColor() {
        return color;
    }


    public Vehicle(int wheels, int doors, String color) {
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        System.out.println("Vehicle Constructor called , New vehicle has " + wheels + " wheels and has " + doors + " doors  and is " + color + " color ");

    }


    private void move(int speed) {
        System.out.println("Vehicle speed is " + speed);

    }


    private void changeGears(int gear) {
        System.out.println("Vehicle Gear is " + gear);

    }

    public void velocity(int speed, int gear) {
        System.out.println("Vehicle velocity called");
        move(speed);
        changeGears(gear);

    }


}

