package com.carlocappellini;

public class Main {

    public static void main(String[] args) {
        Car Lamborghini = new Car();
        System.out.println("Model " + Lamborghini.getModel());
        Lamborghini.setModel("Spyder");
        System.out.println("Model " + Lamborghini.getModel());
    }
}
