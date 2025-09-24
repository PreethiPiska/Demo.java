package com.tnsif.six;

public class TryCatch {
	public static void main(String[] args) {
	        try {
	            int a = 10;
	            int b = 0; // divisor is zero
	            int result = a / b; // this will cause ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed!");
	        }

	        System.out.println("Program continues after the exception handling...");
	    }
}
