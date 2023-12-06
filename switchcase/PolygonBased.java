package com.kn.switchcase;

import java.util.Scanner;

public class PolygonBased {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifPolygonBased(num);
		scan.close();	}

	static void ifPolygonBased(int num) {
		switch(num) {
		case 3:
			System.out.println("TRIANGALE");
			break;
		case 4:
			System.out.println("QUADRILATERAL");
			break;
		case 5:
			System.out.println("PENTAGON");
			break;
			
		case 6:
			System.out.println("HEXAGON");
			break;
		case 7:
			System.out.println("HEPTAGON");
			break;
		case 8:
			System.out.println("OCTAGON");
			break;
		default:
			System.out.println("Entered number is not a polygon in the list");
	}
	}

}

//output:
//Enter a number=
//8
//OCTAGON
//Enter a number=
//2
//Entered number is not a polygon in the list


