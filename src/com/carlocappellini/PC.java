package com.carlocappellini;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherBoard;

    public PC(Case theCase, Monitor monitor, Motherboard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }


    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(20,20,"red");

    }

    private Case getTheCase() {
        return theCase;
    }






    public static void main(String[] args) {


    }

}

