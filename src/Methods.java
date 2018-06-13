public class Methods {
    public static void main(String[] args) {


        // Main is a method, inside main there is the statements that form the method


        //Void means don't send any value back, nothing, empty
        //use void if don't want ot use return any information

        //we can calculate something and send the value back to the code that was actually calling the method in the first place

        //if we do want to return something , change the word void to the data type of the information we want to send back


//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//
//            System.out.println("Your final score is " + finalScore);
//
//        }


        //in programming terms -1 is conventionally used to indicate an error

        // in searching algorithms -1 indicates an invalid value or a value not found


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("your high score was " + highScore);

        gameOver = false;
        score = 10000;
        levelCompleted = 50;

        bonus = 300;


        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("your high score was " + highScore);


        int highScoreP = calculateHighScorePosition(1000);
        displayHighScorePosition("carlo", highScoreP);

        highScoreP = calculateHighScorePosition(500);
        displayHighScorePosition("brent", highScoreP);

        highScoreP = calculateHighScorePosition(100);
        displayHighScorePosition("rich", highScoreP);


        highScoreP = calculateHighScorePosition(50);
        displayHighScorePosition("dumbo", highScoreP);


    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        score = -1;
        System.out.println(score);
        return score;

    }


    // Procedure is a method returning type void
    public static void displayHighScorePosition(String name, int highScorePosition) {

        System.out.println(name + " managed to get into position " + highScorePosition + " int the scores tables");


    }

    public static int calculateHighScorePosition(int score) {

//
//        if (score >= 1000) {
//            System.out.println(score + " score is greater than 1000");
//            return 1;
//        } else if (score >= 500) {
//            System.out.println(" score is greater than 500 and less than 1000");
//            return 2;
//        } else if (score >= 100) {
//            System.out.println(" score is greater than 100 and less than 500");
//            return 3;
//
//        }
//        System.out.println(" numbers were below 100 ");
//        return 4;
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;


    }
}
