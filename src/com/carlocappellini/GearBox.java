package com.carlocappellini;

import java.util.ArrayList;

public class GearBox {
    private int currentGear = 0;
    private int maxGears;

    private boolean clutch;
    ArrayList<Gear> gears;


    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();

        for (int i = 0; i <= maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void addGear(int newGear, double ratio) {
        if (newGear > 0 && newGear <= maxGears) {
            this.gears.add(new Gear(newGear, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear > 0 && newGear <= this.gears.size() && this.clutch) {
            this.currentGear = newGear;
            clutchIn(false);
            System.out.println(newGear);
        } else {
            System.out.println("grind");
            this.currentGear = 0;
        }
    }

    public void clutchIn(boolean clutch) {
        this.clutch = clutch;
    }

    public double wheelSpeed(int revs) {
        if (this.clutch) {
            System.out.println("scream");
            return 0.0;
        }
        return revs * (gears.get(currentGear).getRatio());
    }



    public class Gear {
        private int gearNumber = 0;
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        public Gear(int currentGear, double ratio) {
            this.gearNumber = currentGear;
            this.ratio = ratio;
        }



    }

}
