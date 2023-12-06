package com.kn.switchcase;

import java.util.Scanner;

public class SpecialDish {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifSpecialDish(num);
		scan.close();
	}

	static void ifSpecialDish(int num) {
		switch(num) {
		case 1:
			System.out.println("MONDAY SPECIAL DISH IS PASTA");
			break;
		case 2:
			System.out.println("TUESDAY SPECIAL DISH IS TACOS");
			break;
		case 3:
			System.out.println("WEDNESDAY SPECIAL DISH IS SUSHI");
			break;
		case 4:
			System.out.println("THURSDAY SPECIAL DISH IS STEAK");
			break;
		case 5:
			System.out.println("FRIDAY SPECIAL DISH IS PIZZA");
		break;
		case 6:
			System.out.println("SATURDAY SPECIAL DISH IS LOBSTER");
			break;
		case 7:
			System.out.println("SUNDAY SPECIAL DISH IS BRUNCH");
			break;
		default:
			System.out.println("Entered Number Is Invalied");
	}
	}

}


//OUTPUT:
//Enter a number=
//5
//FRIDAY SPECIAL DISH IS PIZZA
//Enter a number=
//7
//SUNDAY SPECIAL DISH IS BRUNCH
//Enter a number=
//8
//Entered Number Is Invalied
