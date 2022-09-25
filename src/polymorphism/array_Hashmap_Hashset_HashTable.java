package polymorphism;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
	int[]agechewbacca= new int[]{10,15,20,25};
	System.out.println("student age="  +agechewbacca[3]);
	
	String[]studentname=new String[]{"tasfir","ahmed","daiyan","dolon"};
	System.out.println("student name="+studentname[0]);
	
	//multi dimentional array
	int[][]agechewbacca2d ={{10, 15, 20, 25, 30},
	                        {35, 40, 45, 50}};
	System.out.println(" student age 2d =" +agechewbacca2d[0][2]);
	 
	HashMap<String,Integer>student=new HashMap<String,Integer>();
	student.put("alex",30);
	student.put("jahid",30);
	student.put("mamun",30);
	student.put("pappu",30);
	System.out.println("student age=" +student.get("alex"));
	
	HashMap<String,String>Capital=new HashMap<String,String>();
	Capital.put("bd","Dhaka");
	Capital.put("usa","Dc");
	System.out.println("capital city="+ Capital.get("usa"));
	
	HashSet<String> car=new HashSet<String>();
	car.add("TOYOTA");
	car.add("BMW");
	car.add("AUDI");
	System.out.println("car="+ car);
	

	Hashtable<String,String>Region=new Hashtable<String,String>();
	Region.put("bd","Asia");
	Region.put("usa","North America");
	System.out.println("Region="+ Region.get("usa"));
	}
	}


