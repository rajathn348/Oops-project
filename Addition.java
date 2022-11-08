package com;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of A");
		int A=scan.nextInt();
		System.out.println("enter the value of B");
		int B=scan.nextInt();
		scan.close();
		int sum=A+B;
		System.out.println("sum is "+sum);
	}

}
