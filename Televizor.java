package sample;


public class Televizor implements OnOff {
    @Override
    public void on() {
        System.out.println("Телевизор включен");
    }

    @Override
    public void off() {
        System.out.println("Телевизор выключен");
    }


}
