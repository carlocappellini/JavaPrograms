public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualDecimalPlaces(1.4599,1.456));
    }

    public static boolean areEqualDecimalPlaces(double a, double b) {
        // checks if decimals up to 3 decimal places( thousandths place )is equal to other decimal up to 3 decimal places( thousandths place )
        return (int) (a*1000) == (int) (b*1000);


    }
}
