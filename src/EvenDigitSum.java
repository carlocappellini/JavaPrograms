public class EvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(2345689);


    }

    public static int getEvenDigitSum(int number) {


        if (number == 0) {
            return -1;

        }
        int evenNumbers = 0;


        while (number > 0) {

            int checkEven = number % 10;  // to get numbers 1 - 10 in iteration form
            System.out.println(checkEven);
            number = number / 10;

            if (checkEven % 2 == 0) { // checks for % 2 == 0()  in iteration
                evenNumbers += checkEven;
            }


        }
        System.out.println(evenNumbers);
        return evenNumbers;

    }
}