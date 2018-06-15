public class HasSharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(9, 99);

    }

    public static boolean hasSharedDigit(int number, int shared) {


        if (number < 99 || number > 10 && shared < 99 || shared > 10) {

            while ((number % 10 == shared % 10) || (number / 10 == shared % 10) || (number % 10 == shared / 10)) {

                System.out.println("true");
                return true;

            }
        }
        System.out.println("false");
        return false;

    }


}


