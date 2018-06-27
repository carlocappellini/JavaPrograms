public class AllFactors {

    private static String INVALID = "IVALID VALUE";

    public static void main(String[] args) {
        printAllFactors(22);
    }

    public static String printAllFactors(int number) {

        if (number < 0) {
            return INVALID;
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                    continue;
                }
            }
            return "true";
        }

    }
}
