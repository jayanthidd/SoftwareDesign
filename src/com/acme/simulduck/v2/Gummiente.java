package com.acme.simulduck.v2;

public class Gummiente extends Ente {
    public Gummiente(String name) {
        super(name, 3);
    }

    @Override
    public void anzeigen() {
        System.out.println(name + "ist scheu und laesst sich nicht blicken");
    }

    @Override
    public void quaken() {
        System.out.println(name + " macht quietsch quietsch");
    }
}
