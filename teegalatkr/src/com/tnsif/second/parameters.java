package com.tnsif.second;

class MethodOverload {
	    void show(int a) {
	        System.out.println("Number: " + a);
	    }

	    void show(String b) {
	        System.out.println("Text: " + b);
	    }

	    void show(int a, String b) {
	        System.out.println("Number and Text: " + a + ", " + b);
	    }

	    public static void main(String[] args) {
	        MethodOverload obj = new MethodOverload(); // only one object
	        obj.show(10);
	        obj.show("Hello");
	        obj.show(20, "Java");
	    }
}
