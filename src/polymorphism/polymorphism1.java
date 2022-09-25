package polymorphism;

import package1.methodtype;

public class polymorphism1 extends methodtype {

	public static void main(String[] args) {
		car();
		car(4);
		weeklyincome();
		methodtype obj=new methodtype();
		obj.annualincome();
		System.out.println("my monthly income="+ obj. monthlyincomereturn());
	}
	
		
		public static void car(){
			System.out.println("my car is audi");
		}
			public static void car(int door){
				System.out.println(+door);
				
			}
			public static void weeklyincome(){
				int weeklyincome=40*65+50;
				System.out.println("my weekly income =" +weeklyincome);
	}

			public int monthlyincomereturn(){
				int  monthlyincome=hourlyincome*180 +500;
				return monthlyincome;
}
			public  void annualincome(){
				int annualincome=hourlyincome*2000 -100;
		System.out.println("my annual income ="+annualincome);
}
}
