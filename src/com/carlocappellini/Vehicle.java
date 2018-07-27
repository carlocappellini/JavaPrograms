package com.carlocappellini;

public class Vehicle {

    private int wheels;
    private int doors;
    private int gear;
    private String color;

//    public int getWheels() {
//        return wheels;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public int getGear() {
//        return gear;
//    }
//
//    public String getColor() {
//        return color;
//    }


    public Vehicle (int wheels, int doors, int gear, String color){
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.color = color;
        System.out.println("New vehicle has " + wheels +" wheels and has " + doors + " doors and  " + gear +  " gear  and is "+ color  + " color ");

    }



    public void  moving(int speed){
        System.out.println("speed is " + speed);
    }


 public void changingGears(int gear){
     System.out.println("gear is " + gear);

    }

}

