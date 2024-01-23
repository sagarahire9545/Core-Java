package com.array;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60,70,80};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
		System.out.println(" ");
		
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+",");
		}
		
	}

}
