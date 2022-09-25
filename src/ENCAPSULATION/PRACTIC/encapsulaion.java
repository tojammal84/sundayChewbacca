package ENCAPSULATION.PRACTIC;

public class encapsulaion {
	
	private String name="upskill";
	private int ssn=123456;
	private String username= "upskill";
	
	//setter method
	public void setname(String value){
		name =value;
	}
//getter method
	public String getname(){
		return name;
	}

	//setter method
	public void setSSN(int value){
		ssn =value;	
		
	}
	public String getusername(){
		return username;
	}
	public static void main(String[] args) {
	encapsulaion obj=new  encapsulaion();
	obj.setname("tojammal");
	System.out.println(obj.getname());
	obj.setSSN(2345678);
	System.out.println(obj.getusername());
	}
	
	}


