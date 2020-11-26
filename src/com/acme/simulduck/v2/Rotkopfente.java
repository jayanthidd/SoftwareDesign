package com.acme.simulduck.v2;

public class Rotkopfente extends Ente {
    public Rotkopfente(String name) {
        super(name, 2);
    }

    @Override
    public void anzeigen() {
        System.out.println("Rotkopfente zeigt stolz ihren roten Kopf");
    }
}
