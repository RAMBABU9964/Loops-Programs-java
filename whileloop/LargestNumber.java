package com.kn.whileloop;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers as arang=");
		int range=scan.nextInt();
            ifLargestPalindrome(range);
            scan.close();

}

	static void ifLargestPalindrome(int range) {
		int i=range;
		while(i>=1) {
			if(isPalindrome(i)) {
				System.out.println("Largest Palindrome="+i+" within in the range of "+range);
				break;
			}i--;
		}
		}

	private static boolean isPalindrome(int num) {
		int digit,sum=0,temp=num;
		while(num>0) {
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		if(temp==sum) {
			return true;
		}
		return false;
	}
	}

//output:
/*Enter the Numbers as arang=
500
Largest Palindrome=494 within in the range of 500*/
