package com.carlocappellini;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);




private static int[] getIntegers(int array){

    int [] arr = new int[array];

    System.out.println("Enter " + array + " numbers");

    for (int i =0; i < array; i++){
        arr[i] = scanner.nextInt();
    }

    for (int i = 0; i< array; i++){
        System.out.println("number are " + arr[i]);
    }
return arr;

}


    private static int printArray (int[] array){



        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
        return array.length;
    }

    private static int[] sortArray(int [] array){
    int [] arr = new int[array.length];

    for (int i = 0;i < array.length; i++){
        System.out.println("value is " + array[i]);
        arr[i] = array[i];
    }





    return arr;
    }


    public static void main(String[] args) {

    int [] ints = {4,5,34,5423,4};

//    int [] q = getIntegers(5);


    printArray(ints);
    }
}

