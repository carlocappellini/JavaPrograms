package com.carlocappellini;

public class Table {
    private String shape;
    private int legs;
    private String material;

    public String getShape() {
        return shape;
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }


    public Table(String shape, int legs, String material) {
        this.shape = shape;
        this.legs = legs;
        this.material = material;
    }

    public void movingTable(int x, int y) {
        System.out.println("Moving table at " + x + " and " + y + " position in the room");

    }

}
