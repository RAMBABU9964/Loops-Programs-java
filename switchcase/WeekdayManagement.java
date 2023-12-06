package com.kn.switchcase;
import java.util.Scanner;
public class WeekdayManagement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifWeekdayManagement(num);
		scan.close();
	}

	static void ifWeekdayManagement(int num) {
		switch(num) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
		break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("Entered Number Is Invalied");
	}

	}

	}

//OUTPUT:
//Enter a number=
//5
//FRIDAY
//Enter a number=
//8
//Entered Number Is Invalied