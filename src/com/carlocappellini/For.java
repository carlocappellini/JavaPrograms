package com.carlocappellini;

public class For {

    public static void main(String[] args) {
        isPrime(21);

        System.out.println("10000 at 2% = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% = " + calculateInterest(10000.0, 5.0));

        for (int i = 2; i <= 8; i++) {
            System.out.println("interest Rate for " + i + " is " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
            // string format  "%.2f"
            // we pass the value tht we get return from our calculateInterest to the string.format command, and "%2.f" converts the number and output it with just 2 decimal points, this get rid of extra Zeros
        }


        System.out.println("**************************************");

        for (int j = 8; j >= 2; j--) {
            System.out.println("interest Rate for " + j + " is " +
                    String.format("%.2f", calculateInterest(10000.0, j)));


        }

        int count = 0;

        for (int k = 10; k <= 50; k++) {
            if (isPrime(k)) {
                count++;
                System.out.println("Number " + k + " is a prime number");
                if (count == 8) {
                    System.out.println("exiting forLoop");
                    break;
                }

            } else {
                System.out.println(k + " not prime");
            }
        }

    }


    //prime number can be divided evenly only by 1 or by itself,
    // has to be one whole number greater than one
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        // use i = 2 because prime number has to be greater than one
        // we use n / 2   as a shortcut, because what we are attempting to do is find numbers that divide in n so this for loop is only going to go through and calculate what it needs to do so NO number that is greater than n / 2 is going to divide into n//

        // or we can also use

//        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
        //   for (int i = 2; i <= n / 2; i++) {


        for (int i = 2; i <= (long) Math.sqrt(n); i++) {


            // if no remainder ,cant be prime number
            if (n % i == 0) {
                return false;
            }
        }
        System.out.println("prime number " + n);

        return true;

    }

    public static double calculateInterest(double amount, double interestRate) {


        return (amount * (interestRate / 100));
    }
}
