package com.tnsif.six;

public class Throws {
	static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        System.out.println("Program Finished");
    }

}