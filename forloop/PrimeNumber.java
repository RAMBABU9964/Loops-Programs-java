package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers=");
		int number=scan.nextInt();
		ifPrimeNumbers(number);
        scan.close();
	}

	static void ifPrimeNumbers(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}if(count==1) {
		System.out.println("prime numbers="+i);		
			}
		}
		
	}

}

//output:
/*Enter the Numbers=
10
prime numbers=2
prime numbers=3
prime numbers=5
prime numbers=7*/


