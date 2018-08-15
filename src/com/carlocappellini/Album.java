package com.carlocappellini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> listOfsongs;

    public ArrayList<Song> getListOfsongs() {
        return listOfsongs;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.listOfsongs = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration) {

        if (findSong(name) == null) {
            this.listOfsongs.add(new Song(name, duration));
            System.out.println(name + ", song added to list of songs");
            return true;
        } else {
            System.out.println("Song already exists");
            return false;
        }


    }


    public Song findSong(String name) {
        for (int i = 0; i < listOfsongs.size(); i++) {
            Song checkedSong = this.listOfsongs.get(i);
            if (checkedSong.getTitle().equals(name)) {

                System.out.println(name + " Song found");
                return checkedSong;
            } else {
                System.out.println("Song not Found");
                return null;
            }

        }
        return null;


    }
}
