package com.kn.forloop;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers=");
		int num=scan.nextInt();
            ifLargestDigit(num);
            scan.close();

	}

	static void ifLargestDigit(int num) {
		int digit;int temp = -1;
		while(num>0) {
			digit=num%10;
			if(digit>temp) {
				temp=digit;
			}num=num/10;
		}
		System.out.println("Largest value="+temp);
	}

}
//output:
/*Enter the Numbers=
6897
Largest value=9*/
