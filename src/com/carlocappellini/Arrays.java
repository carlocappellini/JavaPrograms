package com.carlocappellini;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);


    private static int[] getIntegers(int array) {

        int[] arr = new int[array];

        System.out.println("Enter " + array + " numbers");

        for (int i = 0; i < array; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < array; i++) {
            System.out.println("number are " + arr[i]);
        }
        return arr;

    }


    private static int printArray(int[] array) {


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array.length;
    }

    private static int[] sortArray(int[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("value is " + array[i]);
            arr[i] = array[i];
        }

        boolean flag = true;
        int[] sortedArray = new int[array.length];
        int temp;


        while (flag) {
            flag = false;


            for (int i = 0; i < sortedArray.length - 1; i++) {

                sortedArray[i] = array[i];

                if (sortedArray[i + 1] < sortedArray[i]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;

                    flag = true;
                }


            }

        }


        return sortedArray;
    }


    public static void main(String[] args) {

        int[] ints = {8, 67, 1, 5, 2};

        sortArray(ints);

//    int [] q = getIntegers(5);


        printArray(ints);
    }
}

