package com.carlocappellini;


public class BankAccount {


// wee are updating this fields by , accessing field with this.field_name

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;


// calling a constructor within a constructor


    // if you try to create an object and don't give any parameters, this are the parameters I will use when creating this object(this is optional)

    // only to make sure the class is created with all the field set and you
    //could issue some default constructors to do that


    // KEEP IN MIND , WHEN WE USING "THIS" TO CALL ANOTHER CONSTRUCTOR, IS AMKE SURE THAT'S THE VERY FIRST LINE THAT EXECUTED

    public BankAccount() {


        // VERY FIRST LINE OF THE BANK ACCOUNT CALLS THE OTHER CONSTRUCTOR

        // THE DEFAULT CONSTRUCTOR , THE EMPTY CONSTRUCTOR, WAS CALLED FIRST, ITS FIRST LINE CALLED THE OTHER ONE WHICH THEN PRINTED OUT THAT MESSAGE
        // "ACCOUNT CONSTRUCTOR WITH PARAMETERS CALLED"


        // THEN EMPTY CONSTRUCTOR IS CALLED


        this(12234, 2.50, "default name", "default  address", "default phone");
        System.out.println("empty constructor  called ");
    }


    // This is now setting the field values in the constructor
    // We can now called this constructor and we will creating the object

    // We shouldn't be calling other methods or even setters within the constructor code


    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {

        System.out.println("Account constructor with parameters called");

        //we could also do this
        //   setAccountNumber(accountNumber);
        // There is conflicting opinions on which is the best approach


// we do all initialization in one constructor like below

        //all other constructors should just call the major constructor

        // we to save the field values directly rather than calling  setters or any other method, like this

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;


        //Rule of thumb is always better to save value of the constructor directly to the field rather than calling the setter

        // going back and setting it to "this.whatever_field_name"  is, you're guaranteed that the field values will be initialized

        // General rule of thumb with constructors is don't call setters or any other me2thod other than another  constructor within those constructors
    }


    // disadvantage of this constructor is that balance and account number haven't been updated

    public BankAccount(String name, String email, String phoneNumber) {


        //so what we could do is put "this" and we can assume that is going to be the default account number 99999 and the default balance is 100 , inside parenthesis of this()


        // here we have defaulted two parameters

        this(99999, 100.0, name, email, phoneNumber);

        // we came up with what the default is because they weren't specified and then we went back and called our major constructor, that pne tha updates all the fields


        // we can get rid of these
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit is " + depositAmount + " , balance is now " + this.balance);

    }

    public void withdrawal(double withdrawalAmount) {


        //we use <0 instead if <=0 , just we can see when we go into the minus
        if (this.balance - withdrawalAmount < 0) {
            System.out.println(withdrawalAmount + " unable to process , Only " + this.balance + " available ");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
            if (this.balance - withdrawalAmount < 25) {
                System.out.println("balance below $25 , balance remaining " + this.balance);
            }
        }


    }


    //We are creating owe own constructor

    //purpose of constructor is to initialize the object that you're creating
    // do whatever you want to do at the time the object is being created
    //It's only called once at the start when we're creating the object
    // does'nt need void.
    // It has only the access modifier and the name of the class,
    // and also the number of parameters


    //Empty constructo - refers to a nullary constructor that is automatically generated by the compiler if no constructors have been defined for a class,
    //
    //
    // the default constructor implicitly calls the superclass's nullary constructor, then executes an empty body.

    // if an empty constructor is called we want to create the object with some default values

    //SCENARIO: if an empty constructor is called, we want to call the constructor with all these parameters and we want to issue some default values for the five fields to do this we type "this"
    // we type brackets
    // this()

    // public BankAccount() {
//    this(12234, 2.50, "default name", "default  address","default phone" )
//        System.out.println("empty constructor  called ");
//    }


    //since we physically typed owr own constructor , Java wont try to overwrite it

    // CONSTRUCTORS CAN BE OVERLOADED

    // we can also call one constructor rom another constructor

//    public BankAccount() {
//        System.out.println("empty constructor  called ");
//    }
//
//
//    // This is now setting the field values in the constructor
//    // We can now called this constructor and we will creating the object
//
//    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {
//
//
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }


}
