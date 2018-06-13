public class DigitSum {

    public static void main(String[] args) {
        sumDigit(125);
    }

    public static int sumDigit(int number) {
        int count = 1;


        int sum = 0;


        while (number >= 10){
            System.out.println(number);

            if (number > 10){
            }

            for (int i = 0; i < number; i += number){
sum += i;
                System.out.println(i);
                System.out.println(number);
                break;
            }


////
//
//        if (number < 10 || number < 0) {
//            System.out.println("-1");
//
//        }
//
//
//        if (number > 10) {
//            for (int i = number; i > 10; i++) {
//
//                System.out.println(number);
//
//                if (number != 10){
//                    number = number / 10;
//                }
//            }


//            number %=10;
//            System.out.println(number);

//            for (int i = 1; i < number; i++) {
//
//                sum++;
//            }
        }


        return sum;


    }
}

