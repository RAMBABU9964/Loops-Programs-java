package com.kn.loops;
public class AssignmentsChecked {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=2;j++) {
			for(int k=1;k<=10;k++) {
				if(i%2!=0&&k%2==0) {
					System.out.println("Student-"+k+" "+"of class-"+j+" "+"of school-"+i+" "+"have completed the assigement");
				}else if(i%2==0&&k%2!=0) {
					System.out.println("Student-"+k+" "+"of class-"+j+" "+"of school-"+i+" "+"have not completed the assigement");
				}else {
					System.out.println("Student-"+k+" "+"of class-"+j+" "+"of school-"+i+" "+"is still doing the assigement");
				}
			
			}
		}
	}
	System.out.println("All the assignment checked");
}
}
