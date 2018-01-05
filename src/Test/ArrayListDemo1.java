package Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static List<String> Names = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		System.out.println("Start Program...!!!");
		
		Names.add("Sunil");
		Names.add("Satish");		
		System.out.println(Names.toString());
		
		Names.set(0, "Golu Cholu");
		
		
		Names.add("Sadhana");
		Names.add("Shobha");
		System.out.println(Names.indexOf("Golu Cholu"));
		System.out.println(Names.toString());
		
		
		Names.remove(0);
		Names.remove("Shobha");
		System.out.println(Names.toString());
		System.out.println(Names.contains("Sunil"));
		
		
		Names.add(2,"Sapana");
		System.out.println(Names.toString());
		System.out.println(Names.size());
		System.out.println(Names.get(2));
		
		
		Names.clear();
		System.out.println("List : "+Names.toString());
		
	}

}
