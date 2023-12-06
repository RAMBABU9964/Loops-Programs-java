package com.kn.elseifladder;
import java.util.Scanner;
public class AgeDifferenceActivities {
	public static void main(String[] args) {
		System.out.println("Enter the age=");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		isAgeDifference(age);
		scan.close();
	}

	static void isAgeDifference(int age) {
		if(age<=12) {
			System.out.println("The age is="+age+" Is Child");
		}else if(age>=13&&age<=19) {
			System.out.println("The age is="+age+" Is Teen");
		}else if(age>=20&&age<=59) {
			System.out.println("The age is="+age+" Is Adult");
		}else if(age>=60) {
			System.out.println("The age is="+age+" Is Senior Citizen");
		}
		
	}
}

//output:
//Enter the age=
//12
//The age is=12 Is Child
//Enter the age=
//15
//The age is=15 Is Teen
//Enter the age=
//21
//The age is=21 Is Adult
//Enter the age=
//80
//The age is=80 Is Senior Citizen