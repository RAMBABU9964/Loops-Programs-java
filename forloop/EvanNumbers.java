package com.kn.forloop;

import java.util.Scanner;

public class EvanNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers=");
		int n=scan.nextInt();
            ifEvanNumbers(n);
            scan.close();
	}

	static void ifEvanNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even Numbers="+i);
			}
		}
		
	}

}

//output:
/*Enter the Numbers=
10
Even Numbers=2
Even Numbers=4
Even Numbers=6
Even Numbers=8
Even Numbers=10*/

