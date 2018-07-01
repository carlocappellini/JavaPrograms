package com.carlocappellini;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//
//        //while (true)  is an endless loop, a loop that does't complete
//
//        int min = 2147483648;
//        int max = -2147483648;

       // OR

       // int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;

//
//        while (true) {
//            System.out.println("enter number");
//
//
//            if (sc.hasNextInt()) {
//                    int number = sc.nextInt();
//
            //        if (number > max) {
            //            max = number;
            //        }
            //        if (number < min) {
            //            min = number;
            //        }
            //
            //    } else {
            //        System.out.println("not a number");
            //        break;
            //    }
            //
//            } else {
//                System.out.println("not a number");
//                break;
//            }
//        }










        //another solution
        Scanner sc = new Scanner(System.in);


        //while (true)  is an endless loop, a loop that does't complete

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("enter number");

            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int number = sc.nextInt();
                System.out.println("number entered " + number);




// first we check if first number flag is set to true, which it is
                // after the user enters the first number we want to set the boolean
                // to false since the user can obviously enter one first number and the next will set the min and max to the value of the first number
                //when a user enter second number the if statement because first is now set to false, so this if statement will truly only execute once when the user enters the first number and never again
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("not a number");
                break;
            }
            sc.nextLine(); // handle input
        }
        System.out.println("min = " + min + " max = " + max);
        sc.close();
    }
}




