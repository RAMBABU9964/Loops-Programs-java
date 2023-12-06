package com.kn.switchcase;

import java.util.Scanner;

public class GardeningShop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		ifGardeningShope(num);
		scan.close();
	}

	static void ifGardeningShope(int num) {
		switch(num) {
		case 1:
			System.out.println("ROSES-  ROSE FOOD");
			break;
		case 2:
			System.out.println("SUNFLOWERS-   ALL PURPOSE FERTILLIZER");
			break;
		case 3:
			System.out.println("ORCHIDS-   ORCHID FERTILIZER");
			break;
		case 4:
			System.out.println("CACTI-  CACTUS MIX");
			break;
		case 5:
			System.out.println("FERNS-  ORGANIC COMPOST");
		break;
		default:
			System.out.println("Entered Number Is Invalied");

	}
	}

}

//OUTPUT:
//Enter a number=
//5
//FERNS-  ORGANIC COMPOST
//Enter a number=
//1
//ROSES-  ROSE FOOD
//Enter a number=
//9
//Entered Number Is Invalied