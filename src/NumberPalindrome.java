public class NumberPalindrome {

    public static void main(String[] args) {

        IsPalindrome(500);

    }

    private static boolean IsPalindrome(int number) {
        int reverse = 0;


        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;




            if (number == reverse || reverse == number) {
                System.out.println("palindrome");
                System.out.println(reverse);
                System.out.println(number);
                return true;
            }
        }
        System.out.println("not a palindrome");
        return false;

    }
}