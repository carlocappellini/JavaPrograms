package com.carlocappellini;

public class Television {
    private int hdmiPorts;
    private String color;
    private Resolution resolution;
    private Enhancement enhancement;

    public Television(int hdmiPorts, String color, Resolution resolution, Enhancement enhancement) {
        this.hdmiPorts = hdmiPorts;
        this.color = color;
        this.resolution = resolution;
        this.enhancement = enhancement;
    }

    public void turnOnTV(){
        System.out.println("TV is On");
    }



}
