package com.carlocappellini;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(90,10,20));
    }



    public static boolean hasTeen( int a, int b, int c){

        return (a > 0 && a >= 13 && a <= 19 || b > 0 && b >= 13 && b <= 19 || c > 0 && c >= 13 && c <= 19);

    }

}

