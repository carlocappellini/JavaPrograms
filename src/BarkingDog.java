public class BarkingDog {
    public static void main(String[] args) {

        bark(true, 2);

    }

    public static boolean bark(boolean barking, int hourOfDay) {


        if (hourOfDay < 0 || hourOfDay > 23) {
            barking = false;
            System.out.println(barking);
        } else if (((hourOfDay < 8) || (hourOfDay > 22)) && barking) {

            barking = true;
            System.out.println(barking);

        } else {
            barking = false;
            System.out.println(barking);

        }
        return barking;
    }
}


