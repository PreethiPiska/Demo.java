package com.tnsif.six;

public class MultipleCatch {
	public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;   // division by zero
            int result = a / b;  
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } 
        catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }

}
