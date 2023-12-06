package com.kn.forloop;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the base number: ");
	int base=scan.nextInt();
	System.out.println("Enter the  exponent: ");
	int exponent=scan.nextInt();
	int result=ifCalculatePower(base,exponent);
	System.out.println(base+" raised to the power of"+exponent+"is="+result);
	scan.close();
	
	}

	static int ifCalculatePower(int base, int exponent) {
		int result=1;
		for(int i=0;i<exponent;i++) {
			result *=base;
		}
		return result;
	}


}

//output:
//Enter the base number: 
//4
//Enter the  exponent: 
//3
//4 raised to the power of3is=64

