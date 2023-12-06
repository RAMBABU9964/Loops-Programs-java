package com.kn.forloop;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Natural Numbers=");
		int number=scan.nextInt();
		ifNuturalNumbers(number);
		scan.close();
	}

	static void ifNuturalNumbers(int number) {
		for(int i=1;i<=number;i++) {
			System.out.println("Nutrral Numbers="+i);
		}
		
	}

}

//output:
//Enter Natural Numbers=
//10
//Nutrral Numbers=1
//Nutrral Numbers=2
//Nutrral Numbers=3
//Nutrral Numbers=4
//Nutrral Numbers=5
//Nutrral Numbers=6
//Nutrral Numbers=7
//Nutrral Numbers=8
//Nutrral Numbers=9
//Nutrral Numbers=10

