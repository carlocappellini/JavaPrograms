public class DiagonalStar {

    private static String INVALID_VALUE = "Invalid Value";
    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        printSquareStar(100);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println(INVALID_VALUE);
            return;
        }

        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                boolean isLastRowOrColumn = row == number || column == number;
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}
