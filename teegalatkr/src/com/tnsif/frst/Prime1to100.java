package com.tnsif.frst;

class Prime1to100 {
	  public static void main(String[] args) {
	    for(int n=2;n<=100;n++){
	      int i; 
	      for(i=2;i<=n/2;i++) if(n%i==0) break;
	      if(i>n/2) System.out.print(n+" ");
	    }
	  }
	}
