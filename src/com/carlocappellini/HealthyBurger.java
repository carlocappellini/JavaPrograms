package com.carlocappellini;

public class HealthyBurger extends Hamburger {
    private String healthyOption1;
    private double healthyOption1Price;
    private String healthyOption2;
    private double healthyOption2Price;

    private String name;

    @Override
    public String getName() {
        return name;
    }

    private int maxToppings;

    public int getMaxToppings() {
        return maxToppings;
    }

    private void setMaxToppings(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    public double getHealthyOption1Price() {
        return healthyOption1Price;
    }



    public double getHealthyOption2Price() {
        return healthyOption2Price;
    }



    public String getHealthyOption1() {
        return healthyOption1;
    }




    public String getHealthyOption2() {
        return healthyOption2;
    }


    public HealthyBurger(String meat, double price) {
        super("Rye Roll", meat, price);
        setMaxToppings(2);
        this.name = "Healthy Burger";


    }


    public void addHealthyItem1(String name, double price) {
        this.healthyOption1 = name;
        this.healthyOption1Price = price;
    }

    public void addHealthyItem2(String name, double price) {
        this.healthyOption2 = name;
        this.healthyOption2Price = price;
    }

    public double healthyBurgerTotal() {


        double price = getPrice();
        System.out.println(this.getName() + " is " + price);

        if (this.healthyOption1 != null) {
            price += healthyOption1Price;
            System.out.println("healthy option 1 added:" + this.healthyOption1 + " for " + this.healthyOption1Price);

        }
        if (this.healthyOption2 != null) {
            price += healthyOption2Price;
            System.out.println("healthy option 2 added: " + this.healthyOption2 + " for " + this.healthyOption2Price);
        }
        System.out.println(this.getName() + " Price total is " + price);

        return price;
    }


}
