public class ParsingValuesFromString {

    public static void main(String[] args) {
String numberAsString  = "2018.0";
        System.out.println("numberAsString " + numberAsString);
                // Integer uses static methods
        // number is converted frm string to an integer

//        int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);

        System.out.println("number = " + number);

numberAsString +=1;
// adds one to the string  = 20181
        System.out.println(numberAsString);

number += 1;
        System.out.println(number);
    }
}
