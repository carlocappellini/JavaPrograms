public class SecondsAndMinutes {
    //constant need to declared outside method in order to be able to use and can't be changed once they are assigned with their " final "
    //value
    // static by default

    // type of constant is string

    private static final String INVALID_MESSAGE = "Invalid Value";




    public static void main(String[] args) {




        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(9909));
        System.out.println(getDurationString(65,14));

    }



    private static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds > 59 || seconds < 0) {

            return INVALID_MESSAGE;
        }

        long hr = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hourString = hr + "h";
        if (hr < 10 ){
            hourString = "0" + hourString;
        }
        String minuteString = hr + "m";
        if (remainingMinutes < 10 ){
            minuteString = "0" + minuteString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10 ){
            secondsString = "0" + secondsString;
        }


        return hourString + " " + minuteString + " " + secondsString + " ";

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_MESSAGE;
        }

        long minutes = seconds / 60;

        long remainingSeconds = seconds % 60;


        return getDurationString(minutes, remainingSeconds);


    }
}
