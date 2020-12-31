package sample;

import sample.Command;

public class TelevizorOnCommand implements Command {
    Televizor televizor;

    public TelevizorOnCommand(Televizor televizor) {
        this.televizor = televizor;
    }

    @Override
    public void execute() {
        televizor.on();
    }

    @Override
    public void undo() {
        televizor.off();
    }
}
