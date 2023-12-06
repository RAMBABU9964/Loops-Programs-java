package com.kn.simpleif;

import java.util.Scanner;

public class VoterEligibleRegistration {

	public static void main(String[] args) {
		System.out.println("Enter voter Age=");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		boolean isVotingRegistration=isVotingRegistration(age);
		if(isVotingRegistration==true) {
			System.out.println("The given Age="+age+" Eligible For Registration");
		}else {
			System.out.println("The given Age="+age+" Not Eligible For Registration");
		}scan.close();
	}

	static boolean isVotingRegistration(int age) {
		if(age>=18) {
		return true;}
		else {
			return false;
		}
	}

}

//output:
//Enter voter Age=
//20
//The given Age=20 Eligible For Registration
//Enter voter Age=
//15
//The given Age=15 Not Eligible For Registration
