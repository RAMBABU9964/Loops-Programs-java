package com.kn.forloop;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Numbers=");
			int n=scan.nextInt();
	            ifOddNumbers(n);
	            scan.close();
		}

		static void ifOddNumbers(int n) {
			for(int i=1;i<=n;i++) {
				if(i%2!=0) {
					System.out.println("Even Numbers="+i);
				}
			}
			
		}
	}
//output:
/*Enter the Numbers=
10
Even Numbers=1
Even Numbers=3
Even Numbers=5
Even Numbers=7
Even Numbers=9*/


