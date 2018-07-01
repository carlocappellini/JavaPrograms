package com.carlocappellini;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        sumFirstAndLastDigit(1021404);

    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number;
        int lastDigit = 0;

        if (number < 0) {
            return -1;
        }


        while (firstDigit >= 10) {

            firstDigit /= 10;
        }
            lastDigit = number % 10;

        System.out.println(number + " = " + firstDigit + " + " + lastDigit + " = " + (firstDigit + lastDigit));


        return firstDigit + lastDigit;
    }


}




