package com.carlocappellini;

import java.util.Scanner;

public class MinimumElement {

    static Scanner scanner = new Scanner(System.in);


    public static int[] readIntegers(int count){
        int []output = new int[count];
        System.out.println("enter " + count + " numbers");

for (int i =0; i < output.length; i++){
    output[i] = scanner.nextInt();

}
for (int i =0; i<output.length; i++){
    System.out.println("values are " + output[i]);
}
        System.out.println(output[count]);


        return output;
    }


    public static void main(String[] args) {

int [] read = readIntegers(4);

    }



}
