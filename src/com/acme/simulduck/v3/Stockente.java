package com.acme.simulduck.v3;

public class Stockente extends Ente {
    public Stockente(String name) {
        super(name, new Flutterflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Stockente zeigt ihr irgendwas");
    }
}
