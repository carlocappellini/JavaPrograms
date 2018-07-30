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
        getMotherBoard().loadProgram("IOSX");
        monitor.drawPixelAt(20,20, "Red" );
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }


    private Motherboard getMotherBoard() {
        return motherBoard;
    }




    public static void main(String[] args) {


    }

}

