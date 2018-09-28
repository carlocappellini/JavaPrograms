package com.carlocappellini;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    // the first 2 methods call the 3rd constructor

    // the third constructor is the only one that save values in our fields

    public VipCustomer() {
        this("jessica", 20, "jess@default");
    }


    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "JohnDoe@emaill");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
