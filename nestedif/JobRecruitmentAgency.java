package com.kn.nestedif;

import java.util.Scanner;

public class JobRecruitmentAgency {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Experience=");
	int experience=scan.nextInt();
	System.out.println("Enter a Skill Level=");
	int skill=scan.nextInt();
	boolean ifJobRecruitmentAgency=ifJobRecruitmentAgency(experience,skill);
	if(ifJobRecruitmentAgency==true) {
		System.out.println("Your Experience="+experience+" And Your Skill Is="+skill+" Your Suitable Candidate");
	}if(ifJobRecruitmentAgency==false) {
		System.out.println("Your Experience="+experience+" And Your Skill Is="+skill+" Your Not Suitable Candidate");
	}scan.close();
	}

	static boolean ifJobRecruitmentAgency(int experience, int skill) {
		if(experience>5) {
			if(skill>7) {
				return true;
			}
		}if(experience<5) {
			if(skill<7) {
	}
		}
		return false;}}	

		
//output:
//Enter your Experience=
//6
//Enter a Skill Level=
//8
//Your Experience=6 And Your Skill Is=8 Your Suitable Candidate
//Enter your Experience=
//4
//Enter a Skill Level=
//5
//Your Experience=4 And Your Skill Is=5 Your Not Suitable Candidate



