package Interfaces;

public class Jio implements Phone {
    @Override
    public void call() {
        System.out.println("Calling from Jio network...");
    }

    @Override
    public void message() {
        System.out.println("jio messages.");
    }
}
