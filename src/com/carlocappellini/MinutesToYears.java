package com.carlocappellini;

public class MinutesToYears {
    private static final String INVALID = "Invalid Value";


    public static void main(String[] args) {
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println(INVALID);
        }

        long yearInMinutes = 525600;
        long yearDays = 365;
        long dayInMinutes = 1440;


        long minutesInYears = minutes / yearInMinutes;

        long remainingDays = minutes % yearInMinutes / dayInMinutes;
        remainingDays %= yearDays;

        System.out.println(minutes + " minutes  = " + minutesInYears + " years  and " + remainingDays + " days");
    }
}

