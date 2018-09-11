package com.carlocappellini;

import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


private ArrayList<Jugador> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
