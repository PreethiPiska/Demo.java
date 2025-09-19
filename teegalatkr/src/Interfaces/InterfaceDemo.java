package Interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Phone jio = new Jio();      
        jio.call();
        jio.message();

        Phone samsung = new Samsung();  
        samsung.call();
        samsung.message();
    }
}