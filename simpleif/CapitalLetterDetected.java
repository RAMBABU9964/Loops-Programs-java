package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetterDetected {

	public static void main(String[] args) {
			System.out.println("Enter a Character=");
			Scanner scan=new Scanner(System.in);
			char character =scan.next().charAt(0);
			boolean isCapitalLetterDetected=isCapitalLetterDetected(character);
			if(isCapitalLetterDetected==true) {
				System.out.println("The given character="+character+" Is a Character");
			}else {
				System.out.println("The given character="+character+" Not a Character");
			}scan.close();
	}

	static boolean isCapitalLetterDetected(char character) {
		if(character>='A'&&character<='Z'){
			return true;
		}else
		return false;
	}
}

//output:
//Enter a Character=
//R
//The given character=R Is a Character
//Enter a Character=
//r
//The given character=r Not a Character
