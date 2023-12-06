package com.kn.switchcase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifVendingMachine(num);
		scan.close();
	}

	static void ifVendingMachine(int num) {
		switch(num) {
		case 1:
			System.out.println("COKE");
			break;
		case 2:
			System.out.println("PEPSI");
			break;
		case 3:
			System.out.println("WATER");
			break;
		case 4:
			System.out.println("JUICE");
			break;
		case 5:
			System.out.println("TEA");
		break;
		default:
			System.out.println("Entered Number Is Invalied");
	}

	}

}

//output:
//Enter a number=
//5
//TEA
//Enter a number=
//8
//Entered Number Is Invalied

