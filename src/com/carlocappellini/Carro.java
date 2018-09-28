package com.carlocappellini;

public class Carro extends Vehicle2 {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;


    private int currentGear;


    public Carro(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Carro.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }

}
