package com.kn.switchcase;

import java.util.Scanner;

public class BookGenrre {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifBookGenrre(num);
		scan.close();
	}

	static void ifBookGenrre(int num) {
		switch(num) {
		case 1:
			System.out.println("FICTION");
			break;
		case 2:
			System.out.println("NON-FICTION");
			break;
		case 3:
			System.out.println("FANTASY");
			break;
		case 4:
			System.out.println("MYSTERY");
			break;
		case 5:
			System.out.println("BIOGRAPHY");
		break;
		default:
			System.out.println("Entered Number Is Invalied");

	}

}}

//OUTPUT:
//Enter a number=
//4
//MYSTERY
//Enter a number=
//1
//FICTION
//Enter a number=
//7
//Entered Number Is Invalied