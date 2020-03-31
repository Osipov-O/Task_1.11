package com.company;

public class Main {

    public static void main(String[] args) {
	double x = 1;
	double f =0 ;
	if ( x<=3 ){
	    f = x*x - 3*x + 9;
	        }
	else if ( x>3 ){
	    f = 1/( Math.pow( x, 3) + 6);
    }
	System.out.println( f );
    }
}
