package com.hfdp.command;

import com.hfdp.command.commands.NoCommand;

public class RemoteControlWithUndo extends RemoteControl{
    private Command undoCommand;

    private final int MAX_COMMANDS = 7;

    public RemoteControlWithUndo() {
        super();
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        super.setCommand(slot, onCommand, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        super.onButtonWasPushed(slot);
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        super.offButtonWasPushed(slot);
        undoCommand = onCommands[slot];
    }

//    public void undoButtonWasPushed() {
//        undoCommand.undo();
//    }
}
