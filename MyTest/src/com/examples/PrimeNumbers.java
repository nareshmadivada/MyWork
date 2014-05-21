package com.examples;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any No:");
		int number=s.nextInt();
		
		for(int i=2;i<number;i++){
		
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
				 isPrime=false;
				 break;
				}
			}
			if(isPrime){
			System.out.println("Prime Numbers : "+i);
		}
		}
		
	}

}
