package com.carlocappellini;

public class Printer {
    private double tonerLevel = 100;

    private int numberOfPAgesToPrint;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPAgesToPrint = 0;
        this.isDuplex = isDuplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPAgesToPrint() {
        return numberOfPAgesToPrint;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void printPaper(int copies){
        int pagesToPrint = copies;
        int tonerUsed = 5;

//        if (this.isDuplex){
//            pagesToPrint = (copies /2) + (copies %2);
//
//            System.out.println(pagesToPrint);
//        }

        if(copies > 1 && this.tonerLevel == 0){
            System.out.println("not enough toner to print");
        }
            else if (copies > 0 &&  this.tonerLevel > 0 && this.tonerLevel <=100){
                System.out.println("printing....");
                for (int i = 1; i <= copies; i++) {
                    this.tonerLevel = tonerLevel - tonerUsed;
                    System.out.println("copy number " + i + " printed");
                    if (this.tonerLevel / 5 ==0 ) {
                        System.out.println("automatic refill at 0");
                        checkIfEmpty();
                        break;
                    }


                }
                System.out.println(this.tonerLevel);




            }






    }

    private void tonerRefill() {
        int inkCartridge = 100;
        int disposeOlfCartridge = 0;
        System.out.println("disposing cartridge");
        this.tonerLevel = this.tonerLevel + disposeOlfCartridge;
        System.out.println("cartridge disposed toner level at " + this.tonerLevel);
        this.tonerLevel = this.tonerLevel + inkCartridge;
        System.out.println("cartridge changed toner is full " + this.tonerLevel );

    }

    private boolean checkIfEmpty() {
        if (this.tonerLevel == 0){
            System.out.println("Printer is out of toner  " + this.tonerLevel);
            tonerRefill();
        } else if (this.tonerLevel == 100) {

            System.out.println("Printer is full with toner");
        }
        else if (this.tonerLevel <=20 || this.tonerLevel>0){
            System.out.println("Printer will require toner soon, has " +  (this.tonerLevel / 5) + " prints left");
        }
        else {
            System.out.println("Printer has " + this.tonerLevel+ " toner left");
        }
        return true;
    }




}




