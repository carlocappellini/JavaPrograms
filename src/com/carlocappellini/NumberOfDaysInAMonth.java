package com.carlocappellini;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {
        isLeapYear(2000);
        getDaysMonth(1, 2020);
    }


    public static boolean isLeapYear(int year) {


        if (year >= 1 && year <= 9999 && year % 400 == 0 && year % 4 == 0) {

            System.out.println(true);
            return true;
        } else {

            System.out.println(false);
            return false;
        }
    }

    public static int getDaysMonth(int month, int year) {

        if ((month < 1 || month > 12) || ((year < 1 || year > 9999))) {
            return -1;

        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                return 31;

            case 2:
                if (isLeapYear(year)) {
                    System.out.println("29");
                    return 29;

                } else {
                    System.out.println("28");
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                return 30;

            default:
                return -1;
        }

    }
}

