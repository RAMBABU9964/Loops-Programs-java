package com.kn.loops;
import java.util.Scanner;
public class LoopingDemo {
public static void main(String[] args) {
	int number,i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("pleas enter any number:");
	int num=scan.nextInt();
for(i=num;i<=num;i++) {
	for(j=1;j<=10;j++) {
		
		System.out.println(i+"*"+j+"="+i*j);
	}
	System.out.println("next........");
}
}
}
