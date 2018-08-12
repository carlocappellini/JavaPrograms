package com.carlocappellini;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public String getName() {
        return name;
    }

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
