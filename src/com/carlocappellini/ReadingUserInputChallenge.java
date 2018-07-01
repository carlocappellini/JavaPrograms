package com.carlocappellini;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

//
        Scanner scanner = new Scanner(System.in);
//
//
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        int count = 1;
//        int sum = 0;
//
//  scanner.next();
//
//            if (hasNextInt) {
//                while (count < 10) {
//                    System.out.println("enter number " + count);
//                    count++;
//                    sum += scanner.nextInt();
//                }
//
//                System.out.println("count" + count);
//                System.out.println("sum" + sum);
//
//            } else {
//                System.out.println("Invalid Value");
//            }
//        }




        //different method


        int counter =0;
        int sum =0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter number # " + order );


            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum +=number;
                if(counter ==10){

                    break;
                }

            }else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line
        }
        System.out.println("sum " + sum) ;
        scanner.close();

    }

}



