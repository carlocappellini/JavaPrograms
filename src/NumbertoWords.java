public class NumbertoWords {
    public static void main(String[] args) {
  numberToWords(123456789);
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
            return;
        }

        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);

        for(int i=0; i<digitCount; i++){
            if(reversedNumber>0) {
                System.out.println(numbers[reversedNumber%10]);
                reversedNumber /= 10;
            } else {
                System.out.println(numbers[0]);
            }
        }
    }

    public static int reverse(int number){
        int reverseNumber=0;
        while(number!=0){
            reverseNumber=reverseNumber*10 + number%10;
            number/=10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number<0) return -1;

        int counter = 1;
        while(number>9){
            counter++;
            number/=10;
        }
        return counter;
    }
}