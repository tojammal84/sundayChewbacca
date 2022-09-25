package com.upskill.assigntment1;

public class constructor {
	
	String studentname;
	int studentage;
	
	public constructor(String name, int age){
		studentname=name;
		studentage=age;
	}
	public static void main(String[] args) {
		constructor obj=new constructor("tasfir",35);
		System.out.println(obj.studentname);
		System.out.println(obj.studentage);

	}

}
