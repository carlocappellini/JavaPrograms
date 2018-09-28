package com.carlocappellini;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private int books;
    private Dimensions dimensions;


    public int getBooks() {
        return books;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }


    public BookShelf(int books, Dimensions dimensions) {

    }

    public void grabABook() {
        System.out.println("Grabbing a Book");
    }

    public void readingBook() {
        System.out.println("Reading Book");
    }

}



