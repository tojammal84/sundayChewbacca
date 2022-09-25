package com.upskill.java_1;

public class constructor1 {
	 String studentname;
	 int studentage;
	
	public constructor1(String name,int age){
		studentname=name;
		studentage=age;
		
	}

	public static void main(String[] args) {
	constructor1 obj=new constructor1("zahid",40);
	System.out.println(obj.studentname);
	System.out.println(obj.studentage);
	

	}

}
