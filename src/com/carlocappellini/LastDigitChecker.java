package com.carlocappellini;

public class LastDigitChecker {


    public static void main(String[] args) {
        hasSameLastDigit(103, 993, 43);

    }

    private static boolean hasSameLastDigit(int digit1, int digit2, int digit3) {


        if (digit1 < 10 || digit1 > 1000 || digit2 < 10 || digit2 > 1000 || digit3 < 10 || digit3 > 1000) {
            System.out.println("false");
            return false;
        }

        if (digit1 % 10 == digit2 % 10 && digit2 % 10 == digit3 % 10 && digit1 % 10 == digit3 % 10) {

            System.out.println((digit1 % 10) + " was found as the same number");
            return true;

        }
        return true;

    }
}
