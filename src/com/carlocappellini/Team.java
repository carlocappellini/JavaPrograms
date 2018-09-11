package com.carlocappellini;

import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    //Jugador is abstract class that other 3 classes extend from
    private ArrayList<Jugador> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(Jugador jugador) {
        if (members.contains(jugador)) {
            System.out.println(jugador.getName() + " is already on this team");
            return false;
        } else {
            members.add(jugador);
            System.out.println(jugador.getName() + " was picked for team " + this.name);
            return true;
        }
    }


    public int numPlayer(Team team) {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore ){
        if (ourScore > theirScore){
            won++;
        }
        else if (ourScore == theirScore){
            tied++;
        }else {
            lost++;
        }

        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);

        }




    }
}
