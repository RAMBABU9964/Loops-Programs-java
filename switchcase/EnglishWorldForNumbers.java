package com.kn.switchcase;
import java.util.Scanner;
public class EnglishWorldForNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifEnglishWorldForNumbers(num);
		scan.close();
	}

	static void ifEnglishWorldForNumbers(int num) {
		switch(num) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
			
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
		System.out.println("SEVEN");
		break;
	   case 8:
		System.out.println("EIGHT");
		break;
	    case 9:
		System.out.println("NINE");
		break;
		default:
			System.out.println("Not In The Rang Of 0to9");
	}

}}


//output
//Enter a number=
//8
//EIGHT
//Enter a number=
//88
//Not In The Rang Of 0to9




