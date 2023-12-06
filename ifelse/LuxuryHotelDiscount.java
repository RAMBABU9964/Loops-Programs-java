package com.kn.ifelse;

import java.util.Scanner;

public class LuxuryHotelDiscount {

	public static void main(String[] args) {
		System.out.println("Enter the Age=");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		boolean ifDiscountApplicable=ifDiscountApplicable(age);
		if(ifDiscountApplicable==true) {
			System.out.println("The given Age="+age+" Senior Citizen Discount is Applicable");
      }else if(ifDiscountApplicable==false) {
    	  System.out.println("The given age="+age+"Regular Charges Applicable");
      }scan.close();

}

	static boolean ifDiscountApplicable(int age) {
		if(age>=60) {
			return true;
		}else if(age<60){
			
		}
		return false;
	}
}

//output:
//Enter the Age=
//65
//The given Age=65 Senior Citizen Discount is Applicable
//Enter the Age=
//48
//The given age=48Regular Charges Applicable
