package com.kn.nestedif;

import java.util.Scanner;

public class EmployeeBenefitsScheme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your year of service=");
		int service=scan.nextInt();
		System.out.println("Enter your Targets=");
		int targets=scan.nextInt();
		isEmployeeBenefitsScheme(service,targets);
		scan.close();
	}

	static void isEmployeeBenefitsScheme(int service, int targets) {
		if(service>3) {
			if(targets>6) {
				System.out.println("Years Of Service="+service+"Monthly Targets="+targets+" Your Eligible For Bonus");
			}
		}if(service<3) {
			if(targets<6) {
				System.out.println("Years Of Service="+service+"Monthly Targets="+targets+" Your Not Eligible For Bonus");
		
	}

}}}


//output:
//Enter your year of service=
//4
//Enter your Targets=
//8
//Years Of Service=4Monthly Targets=8 Your Eligible For Bonus
//Enter your year of service=
//2
//Enter your Targets=
//5
//Years Of Service=2Monthly Targets=5 Your Not Eligible For Bonus

