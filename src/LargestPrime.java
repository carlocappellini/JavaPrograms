public class LargestPrime {

    public static void main(String[] args) {
        getLargestPrime(217);
    }

    public static int getLargestPrime(int number) {

        int prime = 0;
        if (number < 1) {
            return -1;
        } else {


            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    prime = i;

                    number = number / i;
                    System.out.println("Prime Factors " + i);

                }


            }

            System.out.println("largest prime " + prime);

            return prime;

        }

    }


}
