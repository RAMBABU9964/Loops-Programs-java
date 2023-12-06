package com.kn.switchcase;

import java.util.Scanner;

public class RomanNumeral {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a Roman numeral=");
			String romanNumeral =scan.next();
			ifRomanNumeral(romanNumeral);
			scan.close();
		}

		static void ifRomanNumeral(String romanNumeral ) {
			switch(romanNumeral) {
			case"I":
				System.out.println("1");
				break;
			case "II":
				System.out.println("2");
				break;
			case"III":
				System.out.println("3");
				break;
				
			case "IV":
				System.out.println("4");
				break;
			case "V":
				System.out.println("5");
				break;
			
			default:
				System.out.println("Entered Roman is Invalid ");
		}
		
	}

}

//output:
//Enter a Roman numeral=
//IV
//4
//Enter a Roman numeral=
//VII
//Entered Roman is Invalid 

