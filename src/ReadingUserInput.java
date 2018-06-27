import java.util.Scanner;

public class ReadingUserInput {


    public static void main(String[] args) {
        //created instance of scanner
        // read user input
        //scanner.next line = to read a line of input from the console

        //we are now using the next line method to retrieve some information from the console, and print whatever was type by the user
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();


        if (hasNextInt){

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100){

                System.out.println("Your name is " + name + " , and you are " + age + " old");
            }
            else {
                System.out.println("number not in range");
            }


        }else{
            System.out.println("unable to pass year of birth");
        }


        scanner.close();
    }
}

