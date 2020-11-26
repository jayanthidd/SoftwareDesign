package com.acme.simulduck.v3;

public abstract class Ente {
    protected String name;
    private Flugverhalten flugVerhalten;

    public Ente(String name, Flugverhalten flugVerhalten) {
        this.name = name;
        this.flugVerhalten = flugVerhalten;
    }

    public void quaken(){
        System.out.println("com.acme.simulduck.Ente " + name + " quakt");
    }

    public void schwimmen() {
        System.out.println("Ente schwimmt");
    }
    // in the class diagram, this is performFliegen
    public void fliegen() {
        if (flugVerhalten!=null){
            flugVerhalten.fliegen();
        }
    }

    public abstract void anzeigen();
}
