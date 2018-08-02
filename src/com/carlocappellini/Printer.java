package com.carlocappellini;

public class Printer {
    private double tonerLevel = 100;

    private int numberOfPAgesToPrint;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPAgesToPrint, boolean isDuplex) {
        if (tonerLevel == 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPAgesToPrint = numberOfPAgesToPrint;
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
        int tonerUsed = 5;
        if (copies > 0){
            System.out.println("printing....");
            for (int i = 1; i <= copies; i++){
                this.tonerLevel = this.tonerLevel - tonerUsed;
                System.out.println(i + " copies printed");
            }
            System.out.println("toner is at " + this.tonerLevel);
            checkIfEmpty();
        }

    }

    public void tonerRefill() {
        int inkCartridge = 100;
        int disposeOlfCartridge = 0;
        System.out.println("disposing cartridge");
        this.tonerLevel = this.tonerLevel + disposeOlfCartridge;
        System.out.println("cartridge disposed ink level at " + this.tonerLevel);
        this.tonerLevel = this.tonerLevel + inkCartridge;
        System.out.println("cartridge changed ink is full " + this.tonerLevel );

    }

    public boolean checkIfEmpty() {
        if (this.tonerLevel == 100) {
            System.out.println("ink is full");
        } else if (this.tonerLevel <= 20){
            System.out.println("Ink is at " + this.tonerLevel);
        } else {
            tonerRefill();
        }
        return true;
    }

}




