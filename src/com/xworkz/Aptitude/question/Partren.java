package com.xworkz.Aptitude.question;

public class Partren {

	public static void main(String[] args) {
		
		int n=4;
		//main loop
		for(int i=1;i<n;i++) {
			//printing space
			for (int j=n-1;j>=i;j--) {
				System.out.print(" ");	
			}
			for (int k=1;k <=i;k++) {
				System.out.print("$");	
			}
			System.out.println("");	
		}
		System.out.println("``````````");
		int z=4;
		//main loop
		for(int i=1;i<z;i++) {
			//printing space
			for (int j=z-1;j>=i;j--) {
				System.out.print(" ");	
			}
			for (int k=1;k <=i;k++) {
				System.out.print(i);	
			}
			System.out.println("");	
		}
		System.out.println("``````````");
		int a=4;
		//main loop
		for(int i=1;i<a;i++) {
			//printing space
			for (int j=n-1;j>=i;j--) {
				System.out.print(" ");	
			}
			for (int k=1;k <=i;k++) {
				System.out.print(i+" ");	
			}
			System.out.println("");	
		}
		System.out.println("``````````````");
		int f=4;
		//main loop
		for(int i=1;i<f;i++) {
			//printing space
			for (int j=n-1;j>=i;j--) {
				System.out.print(" ");	
			}
			for (int k=1;k <=i;k++) {
				System.out.print("$ ");	
			}
			System.out.println("");	
		}
		
		
		System.out.println("````````````````````````");
		
		int m=4;
		//main loop
		for(int i=1;i<m;i++) {
			//printing space
			for (int j=m-1;j>=i;j--) {
				System.out.print(j);	
			}
			for (int k=1;k <=i;k++) {
				System.out.print(k);	
			}
			System.out.println("");	
		}
		System.out.println("``````````````````");
		int b=4;
		//main loop
		for(int i=1;i<b;i++) {
			//printing space
			for (int j=b-1;j>=i;j--) {
				if(j==2) {
					System.out.print("fazlam");
				}
				else {
					System.out.print(j);
				}
					
			}
			for (int k=1;k <=i;k++) {
				
				if(k==2) {
					System.out.print("fazlam");
				}
				else {
					System.out.print(k);
				}
			}
			System.out.println("");	
		}
		System.out.println("=======================================");
		int g=4;
		//main loop
		for(int i=g-1;i>=1;i--) {
			//printing space
			for (int j=g-1;j>=i;j--) {
				System.out.print(" ");	
			}
			for (int k=1;k <=i;k++) {
				System.out.print("#");	
			}
			System.out.println("");	
		}
		

	}

}
