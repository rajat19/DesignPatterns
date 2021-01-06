package com.hfdp.command;

import com.hfdp.command.commands.NoCommand;

public class RemoteControl {
    protected Command[] onCommands;
    protected Command[] offCommands;

    private final int MAX_COMMANDS = 7;

    public RemoteControl() {
        onCommands = new Command[MAX_COMMANDS];
        offCommands = new Command[MAX_COMMANDS];

        Command noCommand = new NoCommand();
        for (int i = 0; i < MAX_COMMANDS; i++) {
            onCommands[i] = () -> {};
            offCommands[i] = () -> {};
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n--- Remote Control ---\n");
        for (int i = 0; i < MAX_COMMANDS; i++) {
            stringBuilder.append("[slot ")
                    .append(i)
                    .append("]")
                    .append(onCommands[i].getClass().getName())
                    .append("   ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
