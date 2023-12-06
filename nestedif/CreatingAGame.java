package com.kn.nestedif;

import java.util.Scanner;

public class CreatingAGame {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your coins=");
		int coins=scan.nextInt();
		System.out.println("Enter your Level=");
		int level=scan.nextInt();
		System.out.println("Enter your Special Key=");
		boolean key=scan.nextBoolean();
	boolean	ifCreatingAGam= ifCreatingAGame(coins,level,key);
	if(ifCreatingAGam==true) {
		System.out.println("Coins Are="+coins+" Player Level="+level+" Player Have Spical Key="+key+" Special Item Found");
	}if(ifCreatingAGam==false) {
		System.out.println("Coins Are="+coins+" Player Level="+level+" Player Have Spical Key="+key+" Special Item Not Found");
	}	scan.close();
	}

	static boolean ifCreatingAGame(int coins, int level, boolean key) {
		if(coins>10) {
			if(level>5) {
				if(key==true) {
					return true;
				}
			}
		}if(coins<10) {
			if(level<5) {
				if(key==false) {
				}
			}
				}
		return false;
		
		
	}

}
//output:
//Enter your coins=
//12
//Enter your Level=
//7
//Enter your Special Key=
//true
//Coins Are=12 Player Level=7 Player Have Spical Key=true Special Item Found
//Enter your coins=
//s9
//Enter your Level=
//4
//Enter your Special Key=
//false
//Coins Are=9 Player Level=4 Player Have Spical Key=false Special Item Not Found
