package com.carlocappellini;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    String leagueName;
    private ArrayList<T> leagueTeams = new ArrayList<>();

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public void viewLeagueTable() {
        Collections.sort(leagueTeams);


        for (T i : leagueTeams) {

            System.out.println(i.getName());
        }

    }

    public boolean addTeam(T team) {

        if (leagueTeams.contains(team)) {
            System.out.println(team.getName() + " is already on League:" + getLeagueName());

            return false;
        } else {

            leagueTeams.add(team);
            System.out.println(team.getName() + " was added to " + getLeagueName());
            return true;

        }


    }


    public static void main(String[] args) {


        League<Team<SoccerPlayer>> mlsLeague = new League<>("mls");

        Team<SoccerPlayer> juventus = new Team<>("juventus");

        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        SoccerPlayer messi = new SoccerPlayer("Messi");
        SoccerPlayer neymar = new SoccerPlayer("Neymar");

        Object[] players = {ronaldo, messi, neymar};


        for (Object i : players) {
            juventus.addPlayer((SoccerPlayer) i);
        }

        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");

        Team[] teams = {barcelona, juventus};

        for (Object i : teams) {
            mlsLeague.addTeam((Team<SoccerPlayer>) i);
        }


        juventus.matchResult(barcelona, 10, 2);

        mlsLeague.viewLeagueTable();


    }
}
