package collectionMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> li = new LinkedHashMap<Integer,String>();
		li.put(10,"Java");
		li.put(20,"Sql");
		li.put(30,"Sql");
		li.put(40,"Oracle");
		li.put(10, "Selenium");
		li.put(50,"Phython");
		System.out.println("given Map value is :"+li);
		//Size of Map
		int a = li.size();
		System.out.println("Total Size of Map value :"+a);
		
		//To pickup value of corresponding KEY
		String s = li.get(20);
		System.out.println("Value of 20 :"+s);
		String t = li.get(90);
		System.out.println("Value of 90 :"+t);
		
		//To Check whether KEY is present or not
		boolean c = li.containsKey(30);
		System.out.println(c);
		
		//To check whether VALUE is present or not 
		boolean d = li.containsValue("Selenium");
		System.out.println(d);
		
		//To print only KEYS
		Set<Integer> sa = li.keySet();
		System.out.println(sa);
		
		//To print only VALUES
		Collection<String> si = li.values();
		System.out.println(si);
		
		//Iterate map values
		Set<Entry<Integer,String>> se = li.entrySet();
		//Enhanced For loop
		for(Entry<Integer,String> x : se) {
			System.out.println(x);
		}
		for(Entry<Integer,String> x : se) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
		
	}

}
