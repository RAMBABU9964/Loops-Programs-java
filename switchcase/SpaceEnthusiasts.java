package com.kn.switchcase;

import java.util.Scanner;

public class SpaceEnthusiasts {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Plant Name=");
		String name=scan.next();
		ifSpaceEnthusiast(name);
		scan.close();
	}

	static void ifSpaceEnthusiast(String name) {
		switch(name) {
		case "Sun":
			System.out.println("Start");
			break;
		case "Mercury":
			System.out.println("1");
			break;
		case "Venus":
			System.out.println("2");
			break;
		case "Earth":
			System.out.println("3");
			break;
		case "Mars":
			System.out.println("4");
		break;
		case "Jupiter":
			System.out.println("5");
			break;
		case "Saturn":
			System.out.println("6");
			break;
		case "Uranus":
			System.out.println("7");
			break;
		case "Neptune":
			System.out.println("8");
			break;
		default:
			System.out.println("Entered Number Is Invalied");

	}
	}

}

//output:
//Enter a Plant Name=
//Earth
//3
//Enter a Plant Name=
//Mars
//4