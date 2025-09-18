package com.tnsif.frst;

class PalindromeNum {
	  public static void main(String[] args) {
	    int n = 121, rev = 0, temp = n;
	    while(temp > 0){
	      rev = rev * 10 + temp % 10;
	      temp /= 10;
	    }
	    if(n == rev)
	      System.out.println(n + " is Palindrome");
	    else
	      System.out.println(n + " is Not Palindrome");
	  }
	}
