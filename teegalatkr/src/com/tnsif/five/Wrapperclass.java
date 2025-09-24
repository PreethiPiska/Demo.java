package com.tnsif.five;

public class Wrapperclass {
    public static void main(String[] args) {
        
        // Example 1: int -> Integer (Autoboxing) and Integer -> int (Unboxing)
        int a = 5;
        Integer obj1 = a; // Autoboxing
        int b = obj1;     // Unboxing
        System.out.println("Example 1: Integer = " + obj1 + ", int = " + b);

        // Example 2: double -> Double and Double -> double
        double price = 25.5;
        Double obj2 = price;  // Autoboxing
        double newPrice = obj2; // Unboxing
        System.out.println("Example 2: Double = " + obj2 + ", double = " + newPrice);

        // Example 3: char -> Character and Character -> char
        char letter = 'X';
        Character obj3 = letter; // Autoboxing
        char newLetter = obj3;   // Unboxing
        System.out.println("Example 3: Character = " + obj3 + ", char = " + newLetter);
    }
}