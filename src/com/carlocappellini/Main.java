package com.carlocappellini;



import com.sun.java.browser.plugin2.DOM;
import org.junit.Test;

public class Main {


    public static void main(String[] args) {


        //VIP OBJECT----------------------

//        VipCustomer vp = new VipCustomer();
//
//        System.out.println(vp.getName());
//        System.out.println(vp.getEmail());
//        System.out.println(vp.getCreditLimit());
//
//        VipCustomer newVip = new VipCustomer("Pedro", 400, "test@email");
//
//        System.out.println(newVip.getName());
//        System.out.println(newVip.getEmail());
//        System.out.println(newVip.getCreditLimit());
//
//
//        VipCustomer newVip2 = new VipCustomer("tim", 4550);
//
//        System.out.println(newVip2.getName());
//        System.out.println(newVip2.getCreditLimit());
//
//        /////////////////////////////////////////////

        // CAR OBJECT----------------------

//        Car Lamborghini = new Car();
//        System.out.println("Model " + Lamborghini.getModel());
//        Lamborghini.setModel("Spyder");
//        System.out.println("Model " + Lamborghini.getModel());


        ///////////////////////////////////////////////


        //Java automatically creates constructor, when we type new, this calls the constructor, calls a special method that creates the class, its purpose is to physically create the object from the class


        //BANK ACCOUNT OBJECT----------------------

//        BankAccount checking = new BankAccount();//1234, 30.0, "carlo", "test@tgest.com", "323223");


//          WE DON'T NEED THIS ANYMORE BECAUSE THE CONSTRUCTOR HAS DONE THAT FOR US
//
//        checking.setAccountNumber(324324234);
//        checking.setName("Carlo Cappellini");
//        checking.setPhoneNumber("3109137209");
//        checking.setEmail("carloacappellini@gmail.com");
//


        // the values have been automatically updated in hte constructor

//
//        System.out.println(checking.getAccountNumber());
//        System.out.println(checking.getBalance());
//        checking.deposit(400);
//        checking.deposit(3.50);
//        checking.withdrawal(700);
//
//        System.out.println(checking.getBalance());


//

//          BankAccount carloAccount = new BankAccount("Carlo", "Cro@email.com",                    "4234234234");
//        System.out.println(carloAccount.getPhoneNumber());
//        System.out.println("carlo's account balance is "+ carloAccount.getBalance());
//        carloAccount.withdrawal(79);
//
//
//        System.out.println(carloAccount.getBalance());
//
//        carloAccount.deposit(300);
//        System.out.println(carloAccount.getBalance());
//
//        carloAccount.withdrawal(300);
//
//        carloAccount.withdrawal(21);
//        carloAccount.deposit(26);
//        carloAccount.withdrawal(2);

//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Malti poo", 1, 1, 4, 14, 2, 4, 1, 30, "furry");

//        dog.eat();
//        dog.walk();
//        dog.run();


//        Fish fish = new Fish("Nemo", 1,1,2,10,660);
//
//        fish.move(3);


Vehicle car = new Vehicle(4,4,5,"gray");
car.moving(5);
car.changingGears(9);
        }


    }






