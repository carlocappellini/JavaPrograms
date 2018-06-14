public class HasSharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(13, 15);

    }

    public static boolean hasSharedDigit(int number, int shared) {


        if (number < 99 || number > 10 && shared < 99 || shared > 10) {


            while (number >= 10 && shared >=10) {
                number = number % 10;

                System.out.println(number);


                int sharedDigit = shared % 10;
                System.out.println(sharedDigit);




                if (number == sharedDigit) {
                    System.out.println(sharedDigit + " " + number);
                    System.out.println("true");

                    return true;

                }

            }
        }
        System.out.println("false");
        return false;

    }

}


