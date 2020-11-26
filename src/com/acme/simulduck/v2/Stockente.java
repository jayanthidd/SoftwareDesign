package com.acme.simulduck.v2;

public class Stockente extends Ente {
    public Stockente(String name) {
        super(name, 1);
    }

    @Override
    public void anzeigen() {
        System.out.println("Stockente zeigt ihr irgendwas");
    }
}
