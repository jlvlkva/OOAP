package sample;

import sample.Command;

public class TelevizorOfCommand implements Command {
    Televizor televizor;

    public TelevizorOfCommand(Televizor televizor) {
        this.televizor = televizor;
    }

    @Override
    public void execute() {
        televizor.off();
    }

    @Override
    public void undo() {
        televizor.on();
    }
}