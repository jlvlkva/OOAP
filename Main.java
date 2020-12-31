package sample;



public class Main {
    public static void main(String[] args) {
        Control control = new Control();

        Televizor televizor = new   Televizor();
        TelevizorOnCommand televizorOn = new TelevizorOnCommand(televizor);
        TelevizorOfCommand televizorOff = new TelevizorOfCommand(televizor);

       Control.setCommand(1, televizorOn, televizorOff);

       Control.onButtonWasPushed(1);
       Control.offButtonWasPushed(1);

        System.out.println(Control);

       Control.undoButtonWasPushed(5);
    }
}
