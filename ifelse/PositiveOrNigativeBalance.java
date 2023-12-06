package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNigativeBalance {

   public static void main(String[] args) {
		System.out.println("Enter a amount=");
		Scanner scan=new Scanner(System.in);
		int amount=scan.nextInt();
		boolean isPositiveOrNigative=isPositiveOrNigative(amount);
	  if(isPositiveOrNigative==true) {
           System.out.println("The amount="+amount+" Is a Positive Balance");
	 }else if(isPositiveOrNigative==false) {
		   System.out.println("The amount="+amount+" Is a nagative Balance");
        }scan.close();
	  }

   static boolean isPositiveOrNigative(int amount) {
	 if(amount>0) {
			return true;
	 }else if(amount<0) {
			
		}
		return false;
   }
}

//output:
//Enter a amount=
//12
//The amount=12 Is a Positive Balance
//Enter a amount=
//-2
//The amount=-2 Is a negative Balance
