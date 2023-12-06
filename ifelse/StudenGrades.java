package com.kn.ifelse;

import java.util.Scanner;

public class StudenGrades {

	public static void main(String[] args) {
		System.out.println("Enter a marks=");
		Scanner scan=new Scanner(System.in);
		int marks =scan.nextInt();
		boolean isStudentsScore=isStudentsScore(marks);
		if(isStudentsScore==true) {
			System.out.println("The marks="+marks+" PASSED");
		}else if(isStudentsScore==false) {
			
			System.out.println("The marks="+marks+" FAILED");
		}scan.close();
	}

	static boolean isStudentsScore(int marks) {
		if(marks>=60) {
			return true;
		}else if(marks<60) {
			
		}
		
		return false;
		
	}

}
//output:
//Enter a marks=
//60
//The marks=60 PASSED
//Enter a marks=
//55
//The marks=55 FAILED