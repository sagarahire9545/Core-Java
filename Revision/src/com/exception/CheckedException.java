package com.exception;

import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for voting...");
		}else {
			try {
			throw new AgeNotEligibleExcpetion();
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
	}

}
