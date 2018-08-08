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
            System.out.println("number is " + arr[i]);
        }
        return arr;

    }


    private static int printArray(int[] array) {


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array.length;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("value is " + array[i]);
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;


        while (flag) {
            flag = false;


            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i]<sortedArray[i+1]) {
                    temp = sortedArray[i];
                    System.out.println("temp " +temp);
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    System.out.println("temp 2 " +temp);

                    System.out.println("sort " + sortedArray[i]);
                    flag = true;
                }


            }

        }


        return sortedArray;
    }


    public static void main(String[] args) {

        int[] ints = {8, 67, 1, 5, 2};



    int [] q = getIntegers(5);

int [] sorted = sortArray(q);

        printArray(sorted);
    }
}

