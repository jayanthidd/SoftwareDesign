package com.acme.simulduck.v2;

public abstract class Ente {
    protected String name;
    private int flugVerhalten;

    public Ente(String name, int flugVerhalten) {
        this.name = name;
        this.flugVerhalten = flugVerhalten;
    }

    public void quaken(){
        System.out.println("com.acme.simulduck.Ente " + name + " quakt");
    }

    public void schwimmen() {
        System.out.println("Ente schwimmt");
    }

    public void fliegen() {
        switch (flugVerhalten){
            case 1:
                System.out.println("Ente " + name + " flattert");
                break;
            case 2:
                System.out.println("Ente " + name + " segelt durch den Wind");
                break;
            case 3:
                System.out.println("Ente " + name + " kommt nicht vom Boden");
                break;
        }
    }

    public abstract void anzeigen();
}
