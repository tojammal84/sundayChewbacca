package polymorphism;

import package1.methodtype;

public class polymorphism  extends methodtype{

	public static void main(String[] args) {
		car();
		 car(4);
		 weeklyincome();
	}	
		public static void car(){
			System.out.println("my car is audi");
		}

			public static void car(int door){
				System.out.println("my car is audi and it has door" + door);
				
			
		}
		

	}


