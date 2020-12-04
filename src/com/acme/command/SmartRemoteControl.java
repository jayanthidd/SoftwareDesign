package com.acme.command;

public class SmartRemoteControl {

    private Command slot;

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void pressButton(){
        slot.execute();
    }
}
