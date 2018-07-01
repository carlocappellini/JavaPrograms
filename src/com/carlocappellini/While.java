package com.carlocappellini;

public class While {

    public static void main(String[] args) {

        isEvenNumber(41);
//        int count = 1;
//
//        while (count != 6){
//            System.out.println(count);
//            count++;
//        }
//        *********************

//        for (int i = 1; i <= 6; i++){
//            System.out.println(i);
//        }

//        *******************

//        for (count =1; count !=6; count ++){
//            System.out.println(count);
//        }
//
//        count = 1;
//        while (true){
//            if (count == 5){
//                break;
//            }
//            System.out.println(count);
//            count++;
//
//        }
//        **********************

//count = 10;
//        //do while executes at least once
//        do {
//            System.out.println(count);
//            count++;
//            if (count > 100){
//                break; // breaks out of loop
//
//            }
//
//        }while (count != 6);

        int number = 4;
        int finishedNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //byPass the print statement and goes back to the start and code doesn't execute code
                // wont do any code any further down
            }
            System.out.println(number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }

        }
        System.out.println("total even numbers found " + evenNumbersFound);


//        int number = 4;
//        int finishedNumber = 20;
//
//
//        while (number <= finishedNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue; //byPass the print statement and goes back to the start and code doesn't execute code
//                // wont do any code any further down
//            }
//
//
//            System.out.println(sum);
//        }


    }

    public static boolean isEvenNumber(int number) {

        while ((number % 2 == 0)) {
//            System.out.println("even");
            return true;

        }
        return false;

    }

}
