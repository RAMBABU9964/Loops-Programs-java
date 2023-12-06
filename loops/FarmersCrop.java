package com.kn.loops;

public class FarmersCrop {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=6;j++)
		{
			System.out.println("Former has sowed the seed in row" + i +" "+ "spot "+j);
		}
	}
	System.out.println("Completed planting in all therows");
}
}
