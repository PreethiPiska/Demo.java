package com.tnsif.six;

public class Stringindexoutofbound {
    public static void main(String[] args) {
        String str = "Hello";

        try {
            // Accessing an index that does not exist (index 10)
            char ch = str.charAt(10);
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You are trying to access an index that is out of range.");
        }

        System.out.println("Program continues after handling exception...");
    }
}
