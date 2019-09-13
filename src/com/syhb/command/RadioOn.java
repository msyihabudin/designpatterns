package com.syhb.command;

public class RadioOn implements Command {

    private Electronic electronic;

    RadioOn(Electronic newElectronic) {
        this.electronic = newElectronic;
    }

    @Override
    public void execute() {
        electronic.on();
    }

    @Override
    public void undo() {
        electronic.off();
    }

}
