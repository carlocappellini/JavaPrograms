public class FlourPackProblem {

    public static void main(String[] args) {
        canPack(3, 0, 5);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {



        if (bigCount >= 0 || smallCount >= 0) {
            int check;
            int bigBagResult;

            bigBagResult = 5 * bigCount;
            int sum = bigBagResult + smallCount;
            check = goal % 5;

            if (check <= smallCount || sum >= goal) {
                System.out.println(bigCount + " " + smallCount + " " +(check) );
                return true;

            } else {
                return false;
            }


        }
        return false;
    }
}
