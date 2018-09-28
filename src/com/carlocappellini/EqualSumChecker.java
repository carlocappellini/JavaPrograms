package com.carlocappellini;

public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(13, 12, 24));

    }

    public static boolean hasEqualSum(int a, int b, int c) {
        //checks if 1st and 2nd parameter are equal to 3rd parameter

        return (a + b) == c;


    }


}

