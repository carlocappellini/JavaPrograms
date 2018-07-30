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

        Dimensions dimensions = new Dimensions(20,20,5);
Case theCase = new Case("220B", " dell", "240", dimensions);
Monitor monitor = new Monitor("27 inch Beast" , " Apple", 27, new Resolution(2500, 1440));
//        new Resolution(2500, 1440) that creates an instance of a class without using a variable
Motherboard motherboard = new Motherboard("BJ-200", "Asus",4, 6,"v2.44" );
        PC thePC = new PC(theCase,monitor, motherboard);

        thePC.getMonitor().drawPixelAt(3,5,"green");
        thePC.getMotherBoard().loadProgram("Apple IOSX");


        thePC.getTheCase().pressPowerButton();
    }

}

