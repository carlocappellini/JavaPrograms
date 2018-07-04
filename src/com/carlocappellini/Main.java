package com.carlocappellini;

public class Main {

    public static void main(String[] args) {

        // CAR OBJECT
//        Car Lamborghini = new Car();
//        System.out.println("Model " + Lamborghini.getModel());
//        Lamborghini.setModel("Spyder");
//        System.out.println("Model " + Lamborghini.getModel());


        ///////////////


        //Java automatically creates constructor, when we type new, this calls the constructor, calls a special method that creates the class, its purpose is to physically create the object from the class



        BankAccount checking = new BankAccount();//1234, 30.0, "carlo", "test@tgest.com", "323223");


// WE DONT NEED THIS ANYMORE BECAUSE THE CONSTRUCTOR HAS DONE THAT FOR US
//
//        checking.setAccountNumber(324324234);
//        checking.setName("Carlo Cappellini");
//        checking.setPhoneNumber("3109137209");
//        checking.setEmail("carloacappellini@gmail.com");
//


        // the values have been automatically updated in hte constructor


        System.out.println(checking.getAccountNumber());
        System.out.println(checking.getBalance());
        checking.deposit(400);
        checking.deposit(3.50);
        checking.withdrawal(700);

        System.out.println(checking.getBalance());


//


    }
}
