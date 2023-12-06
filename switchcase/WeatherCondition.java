package com.kn.switchcase;

import java.util.Scanner;

public class WeatherCondition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifWeatherCondition(num);
		scan.close();
	}

	static void ifWeatherCondition(int num) {
		switch(num) {
		case 1:
			System.out.println("SUNNY");
			break;
		case 2:
			System.out.println("RAINY");
		case 3:
			System.out.println("SNOWY");
			break;
		case 4:
			System.out.println("WINDY");
			break;
		default:
			System.out.println("Entered Number Is Invalied");

	}

}}

//OUTPUT:
//Enter a number=
//3
//SNOWY
//Enter a number=
//4
//WINDY
