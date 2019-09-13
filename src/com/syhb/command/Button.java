package com.syhb.command;

class Button {

    private Command command;

    Button(Command newCommand) {
        this.command = newCommand;
    }

    void press() {
        command.execute();
    }

    void pressUndo() {
        command.undo();
    }
}
