package com.carlocappellini;

public class Vehicle2 {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle2(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;

        System.out.println("moving at " + currentVelocity+ " mph in direction " + currentDirection);
    }

    public void stop( ){
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
}
