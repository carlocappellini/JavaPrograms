public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(5);
    }

    public static boolean isPerfectNumber(int number) {


        // Mine
//        if (number < 1) {
//            return false;
//        }
//
//        int perfectNumber = 0;
//
//        for (int i = 1; i <= number; i++) {
//            perfectNumber++;
//            if (number % i == 0) {
//                System.out.println(i);
//            }
//
//        }
//        System.out.println(perfectNumber);
//        return true;
//
//
//    }

        // sample
        if (number < 1) {
            return false;
        }
        int divisorsSum = 1;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                divisorsSum += i;
            }
        }
        System.out.println(divisorsSum);
        return number == divisorsSum;
    }
}




