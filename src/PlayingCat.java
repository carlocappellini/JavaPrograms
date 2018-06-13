public class PlayingCat {
    public static void main(String[] args) {


        System.out.println(isCatPlaying(false, 36));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {


        if (summer)   {
            return temperature >= 25 && temperature <= 45;
        }

        return temperature >25 && temperature<= 35;


    }

}