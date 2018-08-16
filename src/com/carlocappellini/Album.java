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
        }
        return false;

    }


    public Song findSong(String name) {
        // goes through the arrayList using variable called checkedSong
        for (Song checkSong : this.listOfsongs) {
            if (checkSong.getTitle().equals(name)) {

                return checkSong;
            }

        }
        return null;
    }


//        Iterator<Song> iterator = listOfsongs.iterator();
//        for (int i = 0; i < listOfsongs.size(); i++) {
//            while (iterator.hasNext()) {
//                if (iterator.next().getTitle().equals(name)) {
//
//
//                    Song checkedSong = listOfsongs.get(i);
//                    System.out.println(name + " Song found");
//                    return checkedSong;
//                }
//
//            }
//
//        }
//        return null;




    public void printList(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(arrayList.get(i));
        }
    }

    public boolean addToPlayList(int trackNumber,LinkedList<Song> playlist ) {
        int index = trackNumber -1;

        if ((index >= 0) && (index <= this.listOfsongs.size())) {
            playlist.add(this.listOfsongs.get(index));
            return true;

        }
        System.out.println("this album does not have a track " + trackNumber);
        return false;
    }
public boolean addToPlayList(String title, LinkedList<Song> playlist){
Song checkedSong = findSong(title);

if (checkedSong != null){

    playlist.add(checkedSong);
return true;

}

    System.out.println("song " + title + " is not in this album");
return false;
}





}




