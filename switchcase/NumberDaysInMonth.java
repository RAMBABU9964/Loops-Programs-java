package com.kn.switchcase;
import java.util.Scanner;
public class NumberDaysInMonth {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Month number=");
		int num=scan.nextInt();
		ifVendingMachine(num);
		scan.close();
	}

	static void ifVendingMachine(int num) {
		switch(num) {
		case 1:
			System.out.println("January Has 31 days");
			break;
		case 2:
			System.out.println("February Has 28 days (29 Days in aLeap Year)");
			break;
		case 3:
			System.out.println("March Has 31 Days");
			break;
		case 4:
			System.out.println("April Has 30 Days");
			break;
		case 5:
			System.out.println("May Has 31 Days");
		break;
		case 6:
			System.out.println("June Has 30 Days");
			break;
		case 7:
			System.out.println("July Has 31 Days");
			break;
		case 8:
			System.out.println("August Has 31 days");
			break;
		case 9:
			System.out.println("September Has 30 days");
			break;
		case 10:
			System.out.println("October Has 31 Days");
			break;
		case 11:
			System.out.println("November Has 30 Days");
			break;
		case 12:
			System.out.println("december Has 31 Days");
			break;
		default:
			System.out.println("Entered invalied Month Number");
	}

}}

//otput:
//Enter a Month number=
//10
//October Has 31 Days
//Enter a Month number=
//2
//February Has 28 days (29 Days in aLeap Year)
//Enter a Month number=
//13
//Entered invalied Month Number
