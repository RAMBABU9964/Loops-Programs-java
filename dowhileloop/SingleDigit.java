package com.kn.dowhileloop;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=scan.nextInt();
		int sum=findSumeOfDigitsUntilSingleDigit(n);
		System.out.println("Sum of Digit until a Single Digit="+sum);
scan.close();
	}

	static int findSumeOfDigitsUntilSingleDigit(int n) {
		int sum;
		do {
			sum=0;
			while(n>0) {
				sum+=n%10;
				n/=10;
			}
			n=sum;
		}while(n>9);
		 return n;
	}

}
/*output:
 * Enter the number=
2586
Sum of Digit until a Single Digit=3*/

