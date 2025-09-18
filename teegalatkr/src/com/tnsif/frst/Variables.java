package com.tnsif.frst;

class Variables {
	  int x = 10;   // instance variable

	  void show() {
	    int y = 20; // local variable
	    System.out.println("Instance variable: " + x);
	    System.out.println("Local variable: " + y);
	  }

	  public static void main(String[] args) {
	    Variables obj = new Variables();
	    obj.show();
	  }
	}