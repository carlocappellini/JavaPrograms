package com.carlocappellini;

public class LeapYearCalculator {


    public static void main(String[] args) {

        LeapYear(2000);
    }


    public static boolean LeapYear(int year) {

        if ((year >= 1) && (year <= 9999) && (year % 4 == 0) || year % 400 == 0) {

            return true;
        }


        return false;

    }


}