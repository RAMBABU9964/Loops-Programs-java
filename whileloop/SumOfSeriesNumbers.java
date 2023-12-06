package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeriesNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a Series=");
        int n=scan.nextInt();
        ifSeriesNumber(n);
	scan.close();
	}

	static void ifSeriesNumber(int n) {
		int i=1;double sum=0.0;
		while(i<=n) {
			sum+=1.0/i;
			i++;
		}
		System.out.println("the series="+sum);
	}

}
