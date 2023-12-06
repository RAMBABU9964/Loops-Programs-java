package com.kn.dowhileloop;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number=");
		double n=scan.nextInt();
		ifCubeRoot(n);
    scan.close();
	}

	static void ifCubeRoot(double n)
	{
		double ifCubeRoot=Math.cbrt(n);
		int i=1;
		do {
			
			System.out.println("cube root of "+n+" is "+ ifCubeRoot);
			break;
	}while(i<=n);
		
	}
		}
/*output:
 * Enter the number=
27
cube root of 27.0 is 3.0*/
 


