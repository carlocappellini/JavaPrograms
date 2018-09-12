package com.carlocappellini;

import java.util.ArrayList;

public class Team<T extends Jugador> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    //Jugador is abstract class that other 3 classes extend from
    private ArrayList<T> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T jugador) {
        if (members.contains(jugador)) {
            System.out.println(((Jugador) jugador).getName() + " is already on this team");
            return false;
        } else {
            members.add(jugador);
            System.out.println(((Jugador) jugador).getName() + " was picked for team " + this.name);
            return true;
        }
    }


    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }

        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);

        }


    }

    public int ranking() {
        return (won * 2) + tied;
    }


    ///MAIN

    public static void main(String[] args) {


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer ken = new BaseballPlayer("Ken");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<SoccerPlayer> juventus = new Team<>("Juventus");

        juventus.addPlayer(messi);


        System.out.println(juventus.numPlayer());


        Team<BaseballPlayer> dodgers = new Team<>("Dodgers");
        dodgers.addPlayer(ken);

Team<String>

    }

}

