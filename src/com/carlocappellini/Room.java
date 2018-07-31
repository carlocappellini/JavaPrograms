package com.carlocappellini;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.tools.jconsole.Tab;

public class Room {


    private String name;
    private Television television;
    private Enhancement enhancement;
    private Table table;
    private BookShelf bookShelf;
    private Couch couch;
    private WallFrame wallFrame;

    public String getName() {
        return name;
    }
    public Television getTelevision() {
        return television;
    }

    public Enhancement getEnhancement() {
        return enhancement;
    }

    public Table getTable() {
        return table;
    }

    public BookShelf getBookShelf() {
        return bookShelf;
    }

    public Couch getCouch() {
        return couch;
    }

    public WallFrame getWallFrame() {
        return wallFrame;
    }

    public Room(String name, Television television, Table table, BookShelf bookShelf, Couch couch, WallFrame wallFrame) {
        this.name = name;
        this.television = television;
        this.table = table;
        this.bookShelf = bookShelf;
        this.couch = couch;
        this.wallFrame = wallFrame;


    }

    public void imHere(){
        wallFrame.observingFrame();
        bookShelf.grabABook();
        couch.layInCouch();
        television.turnOnTV();
        bookShelf.readingBook();
    }

}

