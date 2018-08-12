package com.carlocappellini;

import java.util.ArrayList;


public class Branch {

    private String name;
    private ArrayList<Customer> customers;
    public ArrayList<Branch> branch = new ArrayList<Branch>();

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public Branch() {
        this.customers = new ArrayList<Customer>();
    }
//
//    public ArrayList<Customer> getCustomers() {
//        return customers;
//    }

    public void getCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + " " + customers.get(i).getName());
        }


    }

    public Branch addBranch(String name) {
        return new Branch(name);
    }

    public boolean newCustomer(String customerName, double amount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(name, amount));
            return true;
        }
        return false;

    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existing = findCustomer(customerName);

        if (existing != null) {
            existing.addTransaction(amount);
            return true;

        }
        return false;
    }

    private Customer findCustomer(String customerName) {

        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {

                return checkedCustomer;
            }

        }
        return null;

    }

}
