package com.kn.switchcase;

import java.util.Scanner;

public class TrafficLightRuls {

	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a Color=");
			String color=scan.next();
			ifTrafficLightRuls(color);
			scan.close();
		}

		static void ifTrafficLightRuls(String color) {
			switch(color) {
			case "red":
				System.out.println("STOP");
				break;
			case "yellow":
				System.out.println("READY");
				break;
			case "GREEN":
				System.out.println("GO");
				break;
			
			default:
				System.out.println("Entered Color Is Invalid");
		}
		}


	}

//output:
//Enter a Color=
//GREEN
//GO
//Enter a Color=
//black
//Entered Color Is Invalid


