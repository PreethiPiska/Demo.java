package com.tnsif.five;

public class Stringbufferandbuilder {
    public static void main(String[] args) {

        // Using StringBuffer (Thread-Safe, Synchronized)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");      // Adding text
        sbf.insert(6, "Java ");    // Insert at position
        sbf.replace(0, 5, "Hi");   // Replace part of string
        sbf.delete(3, 8);          // Delete a substring
        sbf.reverse();             // Reverse the string
        System.out.println("StringBuffer Result: " + sbf);

        // Using StringBuilder (Faster, Non-Synchronized)
        StringBuilder sbd = new StringBuilder("Welcome");
        sbd.append(" User");       // Adding text
        sbd.insert(8, " to Java"); // Insert at position
        sbd.replace(0, 7, "Hello"); // Replace part of string
        sbd.delete(5, 10);         // Delete substring
        sbd.reverse();             // Reverse the string
        System.out.println("StringBuilder Result: " + sbd);
    }
}

