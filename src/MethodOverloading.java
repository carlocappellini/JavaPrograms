public class MethodOverloading {
    public static void main(String[] args) {

        calFeetAndInchesToCentimeters(12, 5.0);

        calFeetAndInchesToCentimeters(7, 5);

        calFeetAndInchesToCentimeters(5000);
        calFeetAndInchesToCentimeters(12, 10.0);
        double centimeters = calFeetAndInchesToCentimeters(6, 13);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }
        calFeetAndInchesToCentimeters(157);

        calFeetAndInchesToCentimeters(80.5);


    }

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || ((inches > 12)))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        //1 inch = 2.54cm and 1 foot = 12 inches;
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;


    }

    public static double calFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calFeetAndInchesToCentimeters(feet, remainingInches);


    }

}
