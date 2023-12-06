package com.kn.nestedif;
import java.util.Scanner;
public class DrivingLicense {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age=");
		int age=scan.nextInt();
		System.out.println("Enter your eyesight score=");
		int score=scan.nextInt();
		isDrivingLicense(age,score);
		scan.close();
	}

	static void isDrivingLicense(int age, int score) {
		if(age>=18) {
			if(score>=6) {
				System.out.println("The age="+age+" EyeScore="+score+" Your Are Eligible For Driving License");
			}
		}if(age<18) {
			if(score>=6) {
				System.out.println("The age="+age+" EyeScore="+score+" Your Age Is Low Not Eligible For Driving License");
			}
		}if(age>=18) {
			if(score<6) {
				System.out.println("The age="+age+" EyeScore="+score+" Your EyeScore Is Low Not Eligible For Driving License");
			}
		}
		
	}

}


//output:
//Enter your age=
//18
//Enter your eyesight score=
//7
//The age=18 EyeScore=7 Your Are Eligible For Driving License
//Enter your age=
//15
//Enter your eyesight score=
//8
//The age=15 EyeScore=8 Your Age Is Low Not Eligible For Driving License
//Enter your age=
//25
//Enter your eyesight score=
//5
//The age=25 EyeScore=5 Your EyeScore Is Low Not Eligible For Driving License
