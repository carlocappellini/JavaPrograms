package com.carlocappellini;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private int maxToppings;
    private int count = 0;

    private void setMaxToppings(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    private void setName(String name) {
        this.name = name;
    }


    private String oneItem;
    private double oneItemPrice;

    private String twoItem;
    private double twoItemPrice;

    private String threeItem;
    private double threeItemPrice;

    private String fourItem;
    private double fourItemPrice;

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getOneItem() {
        return oneItem;
    }

    public double getOneItemPrice() {
        return oneItemPrice;
    }

    public String getTwoItem() {
        return twoItem;
    }

    public double getTwoItemPrice() {
        return twoItemPrice;
    }

    public String getThreeItem() {
        return threeItem;
    }

    public double getThreeItemPrice() {
        return threeItemPrice;
    }

    public String getFourItem() {
        return fourItem;
    }

    public double getFourItemPrice() {
        return fourItemPrice;
    }

    public Hamburger(String breadRollType, String meat, double price) {
        this.setName("basic");
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        setMaxToppings(4);
    }

    public void addOneItem(String name, double price) {

        this.oneItem = name;
        this.oneItemPrice = price;
    }

    public void addTwoItem(String name, double price) {
        this.twoItem = name;
        this.twoItemPrice = price;
    }

    public void addThreeItem(String name, double price) {
        this.threeItem = name;
        this.threeItemPrice = price;
    }

    public void addFourItem(String name, double price) {
        this.fourItem = name;
        this.fourItemPrice = price;
    }


    public double burgerTotal() {
        double price = this.price;

        System.out.println(this.getName() + " is " + price);

        if (this.oneItem != null && count <= this.maxToppings) {
            count++;
            price += this.oneItemPrice;
            System.out.println("option " + count + this.oneItem + " for " + this.oneItemPrice);
        }
        if (this.twoItem != null && count <= this.maxToppings) {
            count++;
            price += this.twoItemPrice;
            System.out.println("option " + count + this.twoItem + " for " + this.twoItemPrice);

        }

        if (this.threeItem != null && count <= this.maxToppings) {
            count++;
            price += this.threeItemPrice;

            System.out.println("option  " + count + this.threeItem + " for " + this.threeItemPrice);
        }
        if (this.fourItem != null && count <= this.maxToppings) {
            count++;
            price += this.fourItemPrice;
            System.out.println("option " + count + this.fourItem + " for " + this.fourItemPrice);
        }
        if (count > this.maxToppings) {
            System.out.println("cannot add anymore Toppings");
        }

        System.out.println(this.getName() + " Price total is " + price);
        return price;

    }


}
