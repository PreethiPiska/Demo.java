package Interfaces;

public class Samsung implements Phone {
    @Override
    public void call() {
        System.out.println("Calling fron Samsung phone...");
    }

    @Override
    public void message() {
        System.out.println("samsung messages...");
    }
}
