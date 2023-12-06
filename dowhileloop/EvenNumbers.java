package com.kn.dowhileloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers=");
		int num=scan.nextInt();
            ifEvenNumbers(num);
            scan.close();
	}

	     static void ifEvenNumbers(int num) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.println("even numbers="+i);
			}i++;
			
				
			}while(i<=num);
		
		}
}
/*output:
Enter the Numbers=
10
even numbers=2
even numbers=4
even numbers=6
even numbers=8
even numbers=10*/

