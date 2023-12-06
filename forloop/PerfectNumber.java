package com.kn.forloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers=");
		int num=scan.nextInt();
            ifPerfectNumber(num);
            scan.close();

	}

	static void ifPerfectNumber(int num) {
		int sum=0;int i=1;
		while(i<num) {
			if(sum%i==0) {
				sum=sum+i;
			}i++;
		} if(sum==num) {
			System.out.println("Perfect number="+sum);
		}else {
			System.out.println("not a Perfect number="+sum);
		}
			
	}

}
//output:
/*Enter the Numbers=
28
Perfect number28*/
