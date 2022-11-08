package com;
import java.util.Scanner;
public class Assignment {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	for (int i=1;i<=3;i++) {
		System.out.println("enter a number");
		double a=scan.nextInt();
	if(a%2==0) {
		 System.out.println("\nnumber is even");
	}
	else {
		System.out.println("\nnumber is odd");
	}
	}
	scan.close();
}
}
