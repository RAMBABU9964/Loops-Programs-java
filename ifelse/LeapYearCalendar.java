package com.kn.ifelse;

import java.util.Scanner;

public class LeapYearCalendar {

	public static void main(String[] args) {
		System.out.println("Enter the year=");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		boolean isLeapYear=isLeapYear(year);
		if(isLeapYear==true) {
			System.out.println("the year="+year+" IS THE LEAP YEAR");
		}else if(isLeapYear==false)  {
			System.out.println("the year="+year+" IS NON-LEAP YEAR");
		}scan.close();
	}

	static boolean isLeapYear(int year) {
		if(year%4==0&&(year%100!=0||year%400==0)) {
			return true;
				}else if(year%4!=0){
			}
		return false;
	}
}

//output:
//Enter the year=
//2028
//the year=2028 IS THE LEAP YEAR
//Enter the year=
//2023
//the year=2023 IS NON-LEAP YEAR
