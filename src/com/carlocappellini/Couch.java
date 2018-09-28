package com.carlocappellini;

public class Couch {
    private String material;
    private int seatSize;
    private String color;


    public Couch(String material, int seatSize, String color) {
        this.material = material;
        this.seatSize = seatSize;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public int getSeatSize() {
        return seatSize;
    }

    public String getColor() {
        return color;
    }

    public void layInCouch() {
        System.out.println("Laying in the Couch");

    }
}
