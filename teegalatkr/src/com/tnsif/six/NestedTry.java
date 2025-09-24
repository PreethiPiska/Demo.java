package com.tnsif.six;

public class NestedTry {
	public static void main(String[] args) {
        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index error");
            }
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Division by zero");
        }
        System.out.println("Program Finished");
    }

}