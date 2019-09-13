package com.syhb.command;

public class RadioOff implements Command {

    private Electronic electronic;

    RadioOff(Electronic newElectronic) {
        this.electronic = newElectronic;
    }

    @Override
    public void execute() {
        electronic.off();
    }

    @Override
    public void undo() {
        electronic.on();
    }

}
