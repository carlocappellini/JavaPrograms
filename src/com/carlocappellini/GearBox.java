package com.carlocappellini;

import java.util.ArrayList;

public class GearBox {
    private int currentGear = 0;
    private int maxGears;


    public ArrayList<Gear> gears;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();


        for (int i = 0; i <= maxGears; i++) {
            this.gears.add(new Gear(i, i * 5.3));
        }
    }

    public boolean addGear(int newGear, double ratio) {
        if (newGear > 0 && newGear <= maxGears) {
            this.gears.add(new Gear(newGear, ratio));
            return true;
        }
        return false;
    }
    public void changeGear(int newGear){
        if (newGear > 0 && newGear <= this.gears.size()) {
            this.currentGear = newGear;
            System.out.println(newGear);
        }else {
            System.out.println("grind");
        }
    }


    public class Gear {
        private int gearNumber = 0;
        private double ratio;

        public Gear(int currentGear, double ratio) {
            this.gearNumber = currentGear;
            this.ratio = ratio;
        }




    }

}
