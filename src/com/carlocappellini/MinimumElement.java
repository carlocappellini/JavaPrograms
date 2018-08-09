package com.carlocappellini;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    static int[] readIntegers(int count) {

        int numbersEntered = count;
        int[] output = new int[count];
        int[] array = new int[output.length];

        int sum = 0;


        System.out.println("enter " + numbersEntered + " numbers");

        for (int i = 0; i < output.length; i++) {
            output[i] = scanner.nextInt();
        }

        for (int i = 0; i < output.length; i++) {
            System.out.println("values are " + output[i]);
        }

        System.out.println(Arrays.toString(output));


        return output;

    }

    public static int findMin(int[] arr) {
        int minValue = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= minValue ){
//                    System.out.println("if " +arr[i]+"is less than " + minValue);
                    minValue = arr[i];
                }

            }


        System.out.println("min number is "+minValue);

        return arr[minValue];


    }


    public static void main(String[] args) {

        int[] read = readIntegers(3);




        int findMin2 = findMin(read);







    }


}
