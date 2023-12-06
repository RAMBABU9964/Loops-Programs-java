package com.kn.nestedif;
import java.util.Scanner;
public class LoneApproval {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age=");
		int age=scan.nextInt();
		System.out.println("Enter your annual income=");
		double income=scan.nextDouble();
		ifLoanApproval(age,income);
		scan.close();
	}

	static void ifLoanApproval(int age, double income) {
		if(age>=18) {
			if(income>40000) {
				System.out.println("the age is="+age+" And Income Is="+income+" Your Loan Is Approved");
			}
		}if(age>=18) {
			if(income<40000) {
				System.out.println("the age is="+age+" And Income Is="+income+" Your Income too low Loan Not Approved");
			}
		}if(age<18) {
			if(income>40000) {
				System.out.println("the age is="+age+" And Income Is="+income+" Your Age too Low Loan Not Approved");
			}
		}
		
	}
}


//output:
//Enter your age=
//18
//Enter your annual income=
//45000
//the age is=18 And Income Is=45000.0 Your Loan Is Approved
//Enter your age=
//20
//Enter your annual income=
//35000
//the age is=20 And Income Is=35000.0 Your Income too low Loan Not Approved
//Enter your age=
//15
//Enter your annual income=
//56000
//the age is=15 And Income Is=56000.0 Your Age too Low Loan Not Approved





