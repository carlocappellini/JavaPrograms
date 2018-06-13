public class AreaCalculator {

    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(area(40.0));
        System.out.println(area(9.0, 9.0));
    }


    public static String area(double radius) {

        if (radius == -1.0 || radius < 0.0) {
            return INVALID_MESSAGE;
        }

        double PI = 3.14159265359;
        String circleArea = "Area of Circle = " + (radius * radius * PI);

        return circleArea;



    }


    public static String area(double x, double y) {
        if ((x == -1.0 || y == -1.0) || (x < 0 || y < 0)) {
            return INVALID_MESSAGE;
        }

        String RectangleArea = "Rectangle area = " + (x * y);

        return RectangleArea;
    }


}

