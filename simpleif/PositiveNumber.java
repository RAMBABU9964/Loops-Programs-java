package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number to check positive or negative");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		boolean isPositive=isPositiveNumber(number);
		if(isPositive==true) {
			System.out.println("The given number"+number+"is a POSITIVE Number");
		}else {
			System.out.println("The given number"+number+"is a NEGATIVE Number");
		}scan.close();
	}

	 static boolean isPositiveNumber(int number) {
		if(number>0) {
		return true;}
		else {
			return false;
		}
	}

}



//output:
/*
 * 
 */
//Enter a Number to check positive or negative
//25
//The given number25is a POSITIVE Number
//Enter a Number to check positive or negative
//-58
//The given number-58is a NEGATIVE Number