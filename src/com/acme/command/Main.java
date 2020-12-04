package com.acme.command;

public class Main {
    public static void main(String[] args) {
        // The smart remotecontrol is our invoker
        SmartRemoteControl remoteControl = new SmartRemoteControl();

        //this is our receiver
        Light light = new Light();

        LightCommand lightCommand = new LightCommand(light);

        //the command accesses the invoker
        remoteControl.setCommand(lightCommand);

        remoteControl.pressButton();

    }
}
