public class Switch {
    public static void main(String[] args) {

        int value = 44;


        switch (value) {

            case 1:
                System.out.println("It was 1");
                break;

            case 2:
            case 3:
            case 4:
                System.out.println("Either 2, 3 or 4");
                System.out.println("was actually " + value);

                break;

            default:
                System.out.println("was not 1, 2, 3 or 4");
                break;
        }

        char myChar = 'C';

        switch (myChar) {
            case 'A':
                System.out.println("Character A");
                break;

            case 'B':
                System.out.println("Character B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("Character " + myChar);
                break;

            default:
                System.out.println("could not find A, B, C, D or E");
                break;
        }

        String month = "JaNUARY";

        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("January month");
                break;


            case "JUNE":
                System.out.println(month + " month");
                break;

            default:
                System.out.println("Was a different month");
                break;


        }


    }
}
