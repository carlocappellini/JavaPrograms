package com.carlocappellini;

public class WallFrame {
    private int width;
    private int height;
    private boolean margin;
    private String color;
    private String theme;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isMargin() {
        return margin;
    }

    public String getColor() {
        return color;
    }

    public String getTheme() {
        return theme;
    }

    public WallFrame(int width, int height, boolean margin, String color, String theme) {
        this.width = width;
        this.height = height;
        this.margin = margin;
        this.color = color;
        this.theme = theme;
    }

    public void observingFrame() {

        System.out.println("Looking at Frame");
    }
    }
