package com.upskilljava_6;

public class singleton {

	private singleton(){
		
	}
	public static singleton singletonobj=new singleton();

	public static singleton getInstance(){
	return singletonobj;
}
   protected static void upskill(){
	   System.out.println("upskill method from singleton class");
   }
   }