package com.carlocappellini;

public class Enhancement {

    private int maxHDResolution = 2080;
    private int minHDResolution = 1080;
    private boolean isEnhancedResolution;


    public int getMaxHDResolution() {
        return maxHDResolution;
    }

    public int getMinHDResoluiton() {
        return minHDResolution;
    }

    public boolean isEnhancedResolution() {
        return isEnhancedResolution;
    }


    public Enhancement(int maxHDResolution, boolean isEnhancedResolution) {

        this.maxHDResolution = maxHDResolution;
        this.isEnhancedResolution = isEnhancedResolution;
    }


    public Enhancement(boolean isEnhancedResolution, int minHDResolution) {
        this.isEnhancedResolution = isEnhancedResolution;
        this.minHDResolution = minHDResolution;
    }


    public void resolution4K() {
        isEnhancedResolution = true;
        System.out.println("4k Resolution is now at " + maxHDResolution);

    }

    public void standarResolution() {
        isEnhancedResolution = false;
        System.out.println("Resolution is " + minHDResolution);

    }


}

