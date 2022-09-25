package com.upskilljava_6;

public class Multithreadig {

	public static void main(String[] args) {
		int n=2;
		for( int i=0; i<=0; i++){
			MultithreadigDemo obj=new MultithreadigDemo();
			obj.start();
			
	}

}
	class MultithreadigDemo extends Thread{
		public void run(){
			try{
				System.out.println("Thread" +Thread.currentThread().getId()+"is runing");
			}catch(Exception e){
				System.out.println("Exception is caught");
			}
		}
	}
	}