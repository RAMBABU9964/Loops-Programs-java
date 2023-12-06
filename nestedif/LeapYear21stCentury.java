package com.kn.nestedif;

import java.util.Scanner;

public class LeapYear21stCentury {

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a year=");
	int year=scan.nextInt();
	isLapeYear(year);
	scan.close();
}

private static void isLapeYear(int year) {
	if(year%4==0) {
		if(year>=2000&&year<=2100) {
			System.out.println("21 Century");
		}else {
			System.out.println("Not 21 Centuryu");
		}System.out.println("Leap Year");
	}else {
		System.out.println("Not a Leap Year");
	}
}
}

//output:
//Enter a year=
//2024
//21 Century
//Leap Year
//Enter a year=
//1996
//Not 21 Centuryu
//Leap Year