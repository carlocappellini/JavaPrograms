package com.carlocappellini;

import java.util.Arrays;

public class ReverseArray {


    static void reverse(int[] array) {

        int halfLength = array.length/2;
        int lastNumber = array.length -1;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < halfLength-1; i++) {
            int temp = array[i];
            array[i] = array[lastNumber-i];
            array[lastNumber-i] = temp;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 50, 30, 40, 800, 900, 100, 9};

   reverse(arr);
    }
}
