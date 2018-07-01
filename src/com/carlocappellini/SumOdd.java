package com.carlocappellini;

public class SumOdd {

    public static void main(String[] args) {
        isOdd(4);
        isOdd(1, 100);
    }


    public static boolean isOdd(int number) {
        if ((number % 2 == 1) && (number > 0)) {

            return true;
        }

        return false;


    }


    public static int isOdd(int start, int end) {
        int sum = 0;

        if (start < end && end < start && start < 1 && end < 1) {
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)) {
                sum += i;
            }

        }


        System.out.println(sum);
        return sum;

    }
}
