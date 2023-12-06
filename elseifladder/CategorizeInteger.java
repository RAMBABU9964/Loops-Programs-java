package com.kn.elseifladder;
import java.util.Scanner;
public class CategorizeInteger {
public static void main(String[] args) {
	System.out.println("Enter the number=");
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	ifTheInteger(number);
	scan.close();
	}

 static void ifTheInteger(int number) {
	 if(number<0) {
			System.out.println("The given number="+number+" NEGATIVE");
		}else if(number>0) {
			System.out.println("The given number="+number+" POSITIVE");
		}else if(number==0){
			System.out.println("The given number="+number+" ZERO");   
}
}}

//output:
//Enter the number=
//-86
//The given number=-86 NEGATIVE
//Enter the number=
//89
//The given number=89 POSITIVE
//Enter the number=
//0
//The given number=0 ZERO




