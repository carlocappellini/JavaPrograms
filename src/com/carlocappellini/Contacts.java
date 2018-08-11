package com.carlocappellini;

import java.util.ArrayList;
import java.util.Scanner;



public class Contacts {


    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public static Scanner sc = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    private String name;
    private String phoneNumber;



    public static Contacts addContact(String name, String number){
        System.out.println("Enter contact name");
        name += sc.nextLine();
        contacts.add(name);
        sc.next();
        System.out.println("Enter contact number");
        System.out.println("Contact added: " + name + " - " + number);

        return new Contacts(name,number);

    }

}
