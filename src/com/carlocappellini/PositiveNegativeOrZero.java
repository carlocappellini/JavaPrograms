package com.carlocappellini;

public class PositiveNegativeOrZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-59);
        checkNumber(0);
    }

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("positive");

        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println(" The number was zero");
        }
    }

}
