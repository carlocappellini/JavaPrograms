package com.carlocappellini;

public class Hamburguer {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String oneItem;
    private double oneItemPrice;

    private String twoItemm;
    private double TwoItemPrice;

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

    public String getTwoItemm() {
        return twoItemm;
    }

    public double getTwoItemPrice() {
        return TwoItemPrice;
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

    public void addOneItem(String name, double price){
        this.oneItem = name;
        this.oneItemPrice = price;
    }
    public void addTwoItem(String name, double price){
        this.twoItemm = name;
        this.TwoItemPrice = price;
    }
    public void addThreeItem(String name, double price){
        this.threeItem = name;
        this.threeItemPrice = price;
    }
    public void addFourItem(String name, double price){
        this.fourItem = name;
        this.fourItemPrice = price;
    }



}
