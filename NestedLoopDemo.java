package com.kn.loops;

public class NestedLoopDemo {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
            System.out.println("i="+i);
            int j=1;
            while(j<=2) {
            	System.out.println("j="+j);
            	j++;
            }
			
				System.out.println("Out of Inner Loop");
				
			}
			System.out.println("Out Of Outer Loop");
		}
}