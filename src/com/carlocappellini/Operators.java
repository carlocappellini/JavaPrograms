package com.carlocappellini;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);


        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 " + "= " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;

        System.out.println(previousResult + " % 3 = " + result);


        result = result + 2;
        System.out.println(" result is now " + result);
        result++;
        System.out.println(" result is now " + result);
        result += 4;
        System.out.println(" result is now " + result);
        result -= 1;
        System.out.println(" result is now " + result);
        result /= 2;
        System.out.println(" result is now " + result);


        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not an alien ");


        int topScore = 80;


        if (topScore < 100)
            System.out.println("You got high score");

        int secondScore = 81;
        if ((topScore > secondScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than a 100");

        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("one is these test is true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean isCAr = false;

        if (isCAr == true) {
            System.out.println("this is not supposed to happen");
        }

        //ternary operator that checks if car was evaluated to true is so return true else return false


        isCAr = true;
        boolean wasCAr = isCAr ? true : false;

        if (wasCAr)
            System.out.println("wasCar is true " + wasCAr);

        double dbleVal = 20;
        double secondDbleVal = 80;

        double totalResult = (dbleVal + secondDbleVal) * 25;

        System.out.println("my total = " + totalResult);


        double theRemainder = totalResult % 40;
        System.out.println("reminder is " + theRemainder);

        if (theRemainder <= 20) {
            System.out.println("total was over the limit");

        }


    }

}

