package com.upskill.java_1;

public class FORLOOP {

	public static void main(String[] args) {
		// practiceforloop();
		 //whileloop();
		 //practicedowhileloop();
		// infiniteloop();
		 nestadloop();
		}
	public static void practiceforloop(){
		int i;
			for(i=1 ;i<=10; i++){
				System.out.println("for loop number"+i);
			}
	}
			
			public static void whileloop(){
				int i=1;
				while(i<=10){
					System.out.println("while loop numbe="+i);
					i++;
				}
			}
		public static void practicedowhileloop(){
			int i=1;
			do{
				System.out.println("do while loop="+i);
				i++;
			}while(i<=10);
			}
		public static void infiniteloop(){
			int i=1;
			for(i=1; ; i++){
				System.out.println("infinite loop=" +i);
			}
		}
		public static void nestadloop(){
			int i;
			int j;
			for(i=1;i<10;i++){
				for(j=1; j<=10; j++){
					int multipicationtable=i*j;
					System.out.println(multipicationtable +"");
				}
				System.out.println("");
				}
			}
}
		
			
	
		
		
		
	


