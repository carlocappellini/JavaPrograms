package com.carlocappellini;

public class Ferrari extends Carro {


    private int roadServiceMonths;


    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }



    // we hard code parameters values from the super class call
    // and get rid of parameters passed in the child constructor
    public Ferrari( int roadServiceMonths){
    super("Ferrari", "4WD", 5, 5, 6, false);
    this.roadServiceMonths = roadServiceMonths;

    }

    public void  accelarate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40){
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50){
            changeGear(5);

        } else{
            changeGear(6);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
