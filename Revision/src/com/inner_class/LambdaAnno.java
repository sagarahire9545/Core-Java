package com.inner_class;

interface My1{
	
	 void display();	
}
public class LambdaAnno {

	public static void main(String[] args) {

		My1 my1=()->{
			System.out.println("Using displaying lambda..");
		};
		my1.display();
	}
}
