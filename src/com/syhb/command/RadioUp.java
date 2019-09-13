package com.syhb.command;

public class RadioUp implements Command {

    private Electronic electronic;

    RadioUp(Electronic newElectronic) {
        this.electronic = newElectronic;
    }

    @Override
    public void execute() {
        electronic.volumeUp();
    }

    @Override
    public void undo() {
        electronic.volumenDown();
    }

}
