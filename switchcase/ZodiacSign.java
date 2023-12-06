package com.kn.switchcase;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Plant Name=");
		String name=scan.next();
		ifZodiacSignt(name);
		scan.close();
	}

	static void ifZodiacSignt(String name) {
		switch(name) {
		case "Aries":
			System.out.println("Adventurous");
			break;
		case "Taurus":
			System.out.println("Dependable");
			break;
		case "Gemini":
			System.out.println("Expressive");
			break;
		case "Cancer":
			System.out.println("Intuitive");
			break;
		case "Leo":
			System.out.println("Passionate");
		break;
		case "Virgo":
			System.out.println("Analytical");
			break;
		case "Libra":
			System.out.println("Diplomatic");
			break;
		case "Scorpio":
			System.out.println("Determined");
			break;
		case "Sagittarius":
			System.out.println("Philosophical");
			break;
		case "Capricorn":
			System.out.println("Organized");
			break;
		case "Aquarius":
			System.out.println("Original");
			break;
		case "Pisces":
			System.out.println("Compassionate");
			break;
		default:
			System.out.println("Entered Name Is Invalied");

	}
	}

}

//output:
//Enter a Plant Name=
//Scorpio
//Determined
//Enter a Plant Name=
//Leo
//Passionate