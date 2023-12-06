package com.kn.elseifladder;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		System.out.println("Enter the character=");
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		isVowelAndConsonant(c);
		scan.close();
	}

	static void isVowelAndConsonant(char c) {
		int unicode=(int)c;
		if(unicode>=97&&unicode<=122) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		System.out.println("The Character="+c+" Lowercase Vowel");	
		}else  {
			System.out.println("The Character="+c+" Lowercase Consonant");
		}
		}else if(unicode>=65&&unicode<=90) {
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("The Character="+c+" Uppercase Vowel");
		}else {
			System.out.println("The Character="+c+" Uppercase Consonant");
		}
		}else if(unicode>=48&&unicode<=57) {
			System.out.println("The Character="+c+" Its Digit");
		}
		else {
			System.out.println("The Character="+c+" Special Character");
		}
		}
		
	}

//output:
//Enter the character=
//a
//The Character=a Lowercase Vowel
//Enter the character=
//b
//The Character=b Lowercase Consonant
//Enter the character=
//A
//The Character=A Uppercase Vowel
//Enter the character=
//C
//The Character=C Uppercase Consonant
//Enter the character=
//10
//The Character=1 Its Digit
//Enter the character=
//#
//The Character=# Special Character

