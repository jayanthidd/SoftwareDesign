package com.acme.simulduck.v3;

public class Segelflugverhalten implements Flugverhalten {
    @Override
    public void fliegen() {
        System.out.println("Ente segelt");
    }
}
