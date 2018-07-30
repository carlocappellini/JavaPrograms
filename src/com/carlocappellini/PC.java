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


    public void powerUp() {
        theCase.pressPowerButton();
        motherBoard.loadProgram("IOSX");
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(20, 20, "red");

    }


}

