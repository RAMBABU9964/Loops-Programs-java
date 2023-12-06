package com.kn.simpleif;

import java.util.Scanner;

public class RollerCasterAccess {
		public static void main(String[] args) {
			System.out.println("Enter visitors Age=");
			Scanner scan=new Scanner(System.in);
			int age=scan.nextInt();
			boolean isRideAccessGranted=isRideAccessGranted(age);
           if(isRideAccessGranted==true) {
        	   System.out.println("The givenAge="+age+"Ride access granted");
           }else {
        	   System.out.println("The givenAge="+age+"Ride access not granted"); 
           }scan.close();
	}

		static boolean isRideAccessGranted(int age) {
			if(age>=12) {
			return true;
			}else
			return false;
		}
}


//output

//Enter visitors Age=
//16
//The givenAge=16Ride access granted
//Enter visitors Age=
//11
//The givenAge=11Ride access not granted
