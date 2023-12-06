package com.kn.forloop;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Numbers=");
		int number=scan.nextInt();
		ifNumberTable(number);
		scan.close();
	}

	static void ifNumberTable(int number) {
		for(int i=number;i<=number;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}

}

//output:
//Enter Numbers=
//5
//5*1=5
//5*2=10
//5*3=15
//5*4=20
//5*5=25
//5*6=30
//5*7=35
//5*8=40
//5*9=45
//5*10=50
