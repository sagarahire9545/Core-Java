package com.array;

public class Array {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int arr1[] = { 10, 20, 30, 40, 50, 60 };

//		for (int i = 0; i <= arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		
		for(int x:arr1) {
			System.out.println(x);
		}
		
		System.out.println(arr1.length);
		

	}

}
