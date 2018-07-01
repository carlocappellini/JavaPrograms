package com.carlocappellini;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println("The sum of the digits = " +  sumDigit(15));
    }

    public static int sumDigit(int number) {
        System.out.println(number);
        if (number < 10) {
            return -1;
        }


        int sum = 0;

        // 125 -> 125 /10 = 12 -> 12 * 10 = 120  -> 125 - 120 = 5
        while (number > 0) {
            //Extract the least significant
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10; // number = number / 10;
        }
        return sum;


    }
}

