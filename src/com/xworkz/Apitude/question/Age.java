package com.xworkz.Apitude.question;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Ënter the father's age");
	 int a=sc.nextInt();
	 System.out.println("enter the son's age");
	 int b=sc.nextInt();
	 if(a==(2*b))
	 {
		 System.out.println("father's age is double of that son's");
	 }else {
		 System.out.println("father's age is not double of that son");
	 }
	 

	}

}
