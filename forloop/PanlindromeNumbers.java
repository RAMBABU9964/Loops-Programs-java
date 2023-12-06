package com.kn.forloop;

import java.util.Scanner;

public class PanlindromeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers=");
		int number=scan.nextInt();
		ifPanlindromeNumbers(number);
        scan.close();
	}

	static void ifPanlindromeNumbers(int number) {
		int num=number;int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}if(sum==number) {
			System.out.println("panlindrome number");
		}else {
			System.out.println("Not a panlindrome number");
		}

}}
/*output:
 * Enter the Numbers=
44744
panlindrome number*/
