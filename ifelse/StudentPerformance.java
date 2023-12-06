package com.kn.ifelse;
import java.util.Scanner;
public class StudentPerformance {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter your test-1 score=");
        int test1=scan.nextInt();
        System.out.println("Enter your test-2 score=");
        int test2=scan.nextInt();
        System.out.println("Enter your test-3 score=");
        int test3=scan.nextInt();
        ifStudentPerformance(test1,test2,test3);
        scan.close();
	}

       static void ifStudentPerformance(int test1, int test2, int test3) {
    	   int totalscore=(test1+test2+test3);
    	   int average=totalscore/3;
	     if(test1>50&&test2>50&&test3>50) {
	    	 System.out.println("The total test score="+totalscore+" And the Average="+average+" YOUR PASSED IN ALL THE TEST");
	    	   }else if(average>50) {
	    		   System.out.println("The total test score="+totalscore+" And the Average="+average+" YOU Got Average Score IN ALL THE TEST PASSED ");
	    	   }
	
}

}

//output:
//Enter your test-1 score=
//60
//Enter your test-2 score=
//70
//Enter your test-3 score=
//80
//The total test score=210 And the Average=70 YOUR PASSED IN ALL THE TEST
//Enter your test-1 score=
//40
//Enter your test-2 score=
//50
//Enter your test-3 score=
//80
//The total test score=170 And the Average=56 YOU Got Average Score IN ALL THE TEST PASSED 

