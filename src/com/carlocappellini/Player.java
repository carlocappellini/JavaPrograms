package com.carlocappellini;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int strength;
    private String weapon;

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
        this.weapon = "SWORD";
    }

    public Player() {
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.strength);
        values.add(2, this.weapon);


        return values;

    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.strength = Integer.parseInt(savedValues.get(1));
        }
        this.weapon = savedValues.get(2);
    }


}
