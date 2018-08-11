package com.carlocappellini;

public class DeluxeBurger extends Hamburger {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    private String chips;
    private String drink;

    public DeluxeBurger(String breadRollType,String meat, double price
    ){
        super(breadRollType,meat,price);
        this.name = "Deluxe Burger";

        super.addOneItem("chips", 1);
        super.addTwoItem("drink", 2);
    }




    public   double total (){

        System.out.println(this.getName() +" is " + this.getPrice()) ;
        return this.getPrice();
    }




}
