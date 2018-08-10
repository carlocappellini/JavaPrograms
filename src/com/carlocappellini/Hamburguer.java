package com.carlocappellini;

public class Hamburguer {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

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

    public Hamburguer(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
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

        System.out.println("bUrgEr is " + price);

        if (this.oneItem != null) {
            price += this.oneItemPrice;
            System.out.println("added " + this.oneItem + " for " + this.oneItemPrice);

        }
        if (this.twoItem != null) {
            price += this.twoItemPrice;
            System.out.println("added " + this.twoItem + " for " + this.twoItemPrice);

        }

        if (this.threeItem != null) {
            price += this.threeItemPrice;

            System.out.println("added " + this.threeItem + " for " + this.threeItemPrice);
        }
        if (this.fourItem != null) {
            price += this.fourItemPrice;
            System.out.println("added " + this.fourItem + " for " + this.fourItemPrice);
        }
        System.out.println(price);
        return price;

    }


}
