package com.carlocappellini;

public class Printer {
    private double tonerLevel = 100;

    private int numberOfPAgesToPrint;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
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

    public void printPaper(int copies) {
        int pagesToPrint = copies;
        int tonerUsed = 5;

        checkIfEmpty();

        if (copies > 0 && this.tonerLevel > 0 && this.tonerLevel <= 100) {
            System.out.println("Printing....");

            if (this.isDuplex) {
                pagesToPrint = (copies / 2) + (copies % 2);

                if (copies == 1) {
                    this.tonerLevel = tonerLevel - tonerUsed;
                    System.out.println(pagesToPrint + " page printing");
                }
                if (copies % 2 == 0 && this.tonerLevel - tonerUsed != 0) {
                    System.out.println("Double Page copies printed " + pagesToPrint);

                    for (int i = 1; i <= copies; i++) {
                        this.tonerLevel = tonerLevel - tonerUsed;
                    }
                    checkIfEmpty();
                }
                if (copies % 2 != 0 && this.tonerLevel - tonerUsed != 0) {
                    System.out.println(copies % pagesToPrint + " pages and " + (copies % 2) + " page");
                    for (int i = 1; i <= copies; i++) {
                        this.tonerLevel = tonerLevel - tonerUsed;
                    }
                    checkIfEmpty();

                }


            } else {
                for (int i = 1; i <= copies; i++) {
                    this.tonerLevel = tonerLevel - tonerUsed;
                    System.out.println("copy number " + i + " printed");
                }
                checkIfEmpty();


            }

        }


    }

    private void tonerRefill() {
        int inkCartridge = 100;
        int disposeOlfCartridge = 0;
        System.out.println("disposing cartridge");
        this.tonerLevel = this.tonerLevel + disposeOlfCartridge;
        System.out.println("cartridge disposed toner level at " + this.tonerLevel);
        this.tonerLevel = this.tonerLevel + inkCartridge;
        System.out.println("cartridge changed toner is full " + this.tonerLevel);

    }

    private boolean checkIfEmpty() {

        if (this.isDuplex && this.tonerLevel != 0 || this.tonerLevel != 0) {
            System.out.println("Printer has " + this.tonerLevel + " toner left");
        }

        if (this.isDuplex && this.tonerLevel == 100 || this.tonerLevel == 100) {
            System.out.println("Printer is full with toner");

        }
//        else if (this.isDuplex && this.tonerLevel < 20 || this.tonerLevel < 20) {
//            System.out.println("Printer will require toner soon, has enough for " + (this.tonerLevel/5) + " page left");
//        }
        if (this.isDuplex && this.tonerLevel == 0 || this.tonerLevel == 0) {
            System.out.println("Printer is out of toner  " + this.tonerLevel);
            tonerRefill();

        }
        return true;
    }


}




