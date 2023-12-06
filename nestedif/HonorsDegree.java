package com.kn.nestedif;

import java.util.Scanner;

public class HonorsDegree {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your GPA=");
		double gpa=scan.nextDouble();
		System.out.println("Enter your Credits=");
		int credits=scan.nextInt();
		boolean ifHonorsDegreeEligible =ifHonorsDegreeEligible(gpa,credits);
       if(ifHonorsDegreeEligible==true) {
    	   System.out.println("The GPA is="+gpa+" Credits is="+credits+" Your Eligible For Honors Degree");
       }if(ifHonorsDegreeEligible==false) {
    	   System.out.println("The GPA is="+gpa+" Credits is="+credits+" Your Not Eligible For Honors Degree");
       }scan.close();
	}

	private static boolean ifHonorsDegreeEligible(double gpa, int credits) {
		if(gpa>3.5) {
			if(credits>120) {
				return true;
			}
		}if(gpa<3.5) {
			if(credits<120) {
				
			}
		}
		return false;
	}

}

//output:
//Enter your GPA=
//3.9
//Enter your Credits=
//140
//The GPA is=3.9 Credits is=140 Your Eligible For Honors Degree
//Enter your GPA=
//3.3
//Enter your Credits=
//130
//The GPA is=3.3 Credits is=130 Your Not Eligible For Honors Degree

