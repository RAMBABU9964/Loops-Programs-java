package com.kn.whileloop;

public class FindSume {

	public static void main(String[] args) {
		int n=12345789;
		ifFindSum(n);

	}

	    static void ifFindSum(int n) {
		while(n>=10) {
			int sum=0;
			while(n!=0) {
				int r=n%10;
			sum=sum+r;
				n=n/10;
			}
		
		n=sum;
		System.out.println("Find Sume="+sum);
		}
	}

}
/*output:
Find Sume=39
Find Sume=12
Find Sume=3*/
