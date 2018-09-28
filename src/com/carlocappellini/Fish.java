package com.carlocappellini;

public class Fish extends Animal {


    //Unique Fish characteristics
    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        // we can define brain and body and take them out of the constructor
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish.rest()called,  fish is resting");
    }

    private void swim(int speed) {
        System.out.println("Fish.swim() was called, fish is swimming");
        super.move(speed);
    }


    @Override
    public void move(int speed) {
        System.out.println("Fish.move called");
        swim(speed);
        moveMuscles();
        moveBackFin();
    }

    private void moveMuscles() {
        System.out.println("Fish moving muscles");

    }

    private void moveBackFin() {
        System.out.println("Moving Back fin");

    }
}

