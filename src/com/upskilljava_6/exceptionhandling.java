package com.upskilljava_6;

public class exceptionhandling {

	public static void main(String[] args) {
		System.out.println("hello Tasfir");
		try{
		int x= 10;
		int y =0;
		int z=x/y;
		System.out.println(+z);

		}catch(ArithmeticException e){
			System.out.println("arithmetic exception available");
		}
		
    finally{
    	System.out.println("exception is proceed");
    }
}
}
