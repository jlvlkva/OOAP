package sample;

import java.util.Stack;

public class Control {
        Command[] onCommands;
        Command[] offCommands;

        Stack<Command> undoCommand;

        public Control() {
            this.onCommands = new Command[3];
            this.offCommands = new Command[3];

            Command cansel = new Cansel();
            for (int i = 0; i < 2; i++) {
                onCommands[i] = cansel;
                offCommands[i] = cansel;
            }

            this.undoCommand = new Stack<>();
        }

        public void setCommand(int slot, Command onCommand, Command offCommand) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }

        public void onButtonWasPushed(int slot) {
            onCommands[slot].execute();
            undoCommand.push(onCommands[slot]);
        }

        public void offButtonWasPushed(int slot) {
            offCommands[slot].execute();
            undoCommand.push(offCommands[slot]);
        }

        public void undoButtonWasPushed(int quantity) {

            for (int i = 0; i < quantity; i++) {

                undoCommand.pop().undo();
            }
        }


        @Override
        public String toString() {
            String str = new String("");
            str += "\n--------RemoteControl--------\n";

            for (int i = 0; i < onCommands.length; i++) {
                str += "[slot " + i + "] " + onCommands[i].getClass().getName().substring(onCommands[i].getClass().getName().lastIndexOf('.')) +
                        " " + offCommands[i].getClass().getName().substring(offCommands[i].getClass().getName().lastIndexOf('.')) + "\n";
            }
            return str;
        }
    }


