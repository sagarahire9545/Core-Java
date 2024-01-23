package lambda_expression_test;

import java.util.function.BiFunction;

public class MethodRef2 {

	public static int sum(int a,int b) {
		return(a+b);
	}
	
	public static void threadStatus() {
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Thread t=new Thread(MethodRef2::threadStatus);
//		t.start();
		
		//by using BiFunction
		
		BiFunction<Integer, Integer,Integer> bi=MethodRef2::sum;
		int res=bi.apply(50, 63);
		System.out.println("Result: "+res);

	}

}
