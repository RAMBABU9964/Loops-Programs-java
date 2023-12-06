package com.kn.ifelse;
import java.util.Scanner;
public class MultipleNumber {
public static void main(String[] args) {
		System.out.println("Enter a number=");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		boolean isMultipalByFive=isMultipalByFive(number);
		if(isMultipalByFive==true) {
			System.out.println("The number="+number+" Is Multiple of 5");
		}else {
			System.out.println("The number="+number+" Is Not Multiple of 5");	
		}scan.close();
	}

        static boolean isMultipalByFive(int number) {
	if(number%5==0) {
		return true;
	}else {
		
	}
	     return false;
}

}

//output:
//Enter a number=
//50
//The number=50 Is Multiple of 5
//Enter a number=
//28
//The number=28 Is Not Multiple of 5