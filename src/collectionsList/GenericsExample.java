package collectionsList;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(30);
		//To add all values 
		System.out.println("All values in List li :"+li);
		
		//To find Size of list
		int a = li.size();
		System.out.println("Size of the list :"+a);
		
		//To pick only one value from list
		int b = li.get(3);
		System.out.println("3rd Index value :"+b);
		
		//To add value in particular index
		li.add(3,90);
		System.out.println("Add a value in 3rd index :"+li);
		
		//Remove values in particular index
		li.remove(4);
		System.out.println("Removing the 4th index value :"+li);
		
		//Replace value in particular index
		li.set(0, 70);
		System.out.println("Replace the 0th index value "+li);
		
		//To find out index position
		int c = li.indexOf(50);
		System.out.println("Index position of 50 :"+c);
		int d = li.indexOf(100);
		System.out.println("Index position of 100 :"+d);
		
		//To find last index position
		int e = li.lastIndexOf(30);
		System.out.println("Last index position of 30 "+e);
		
		//To Check whether list contains that value or not
		boolean f = li.contains(40);
		System.out.println("It contains value of 40 :"+f);
		
		//To check whether List is Empty or not
		List<Integer> si = new ArrayList<Integer>();
		System.out.println("All values in list si :"+si);
		boolean g = si.isEmpty();
		System.out.println("Whether si list empty or not :"+g);
		boolean i = li.isEmpty();
		System.out.println("Whether li list empty or not :"+i);
		
		//To copy all values one list to another
		//List<Integer> si = new ArrayList<Integer>();
		System.out.println("Before copying values in si list :"+si);
		si.addAll(li);
		System.out.println("After copying values in si from li list :"+si);
		si.add(100);
		si.add(110);
		si.add(120);
		System.out.println("After adding some values in si :"+si);
		
		//To print all common values from both list
		//si.retainAll(li);
		//System.out.println("Print Commom values from both list :"+si);
		
		//To remove all the common values
		System.out.println(li);
		System.out.println(si);
		si.removeAll(li);
		System.out.println("after removing common values from both list :"+si);		
		
	}

}
