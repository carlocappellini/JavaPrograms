package com.carlocappellini;

public abstract class Jugador {
    private String name;


    public Jugador(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
