package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		System.out.println("Enter a amount=");
		Scanner scan=new Scanner(System.in);
		int amount =scan.nextInt();
		boolean isDiscountApplicable=isDiscountApplicable(amount);
		if(isDiscountApplicable==true) {
			System.out.println("The amount="+amount+" Discount of 20% is Applicable");
		}else
		{
			System.out.println("The amount="+amount+" Discount is not Applicable");
		}scan.close();
	}

	static boolean isDiscountApplicable(int amount) {
		if(amount>=200) {
			return true;
		}else
		return false;
	}}

//output:
//Enter a amount=
//250
//The amount=250 Discount of 20% is Applicable
//Enter a amount=
//198
//The amount=198 Discount is not Applicable