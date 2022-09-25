package com.upskilljava_6;

public class Exception_TryCatch {

	public static void main(String[] args) {
		// build in exeption- array
		try{
		int[]agechewbacca=new int[]{25, 26, 60, 45, 55, 35};
		System.out.println("age chewbacca:" + agechewbacca[6]);
		}catch(Exception e){
			System.out.println("array index not available");
			e.printStackTrace();
		}
		
//specific built in exception-NumberformatException
		
		try{
			int num=Integer.parseInt("Test");
			System.out.println("value of int=" +num);
			}catch(NumberFormatException e){
				System.out.println("please enter valid num");
				e.printStackTrace();
	}
// user define exception
		try{
			throw new Exception("Test");
		}catch(Exception e){
			System.out.println("user define Exception");
			e.printStackTrace();
			
		}
		finally{
			System.out.println("test Exception completed");
		}
}
}
