package collectionSet;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// Tree-Set character is print values in ASCENDING ORDER
		//If we give 'char' how will get ascending order
		char c = 'A';
		int x = c;
		System.out.println("Character of 'A' value is :"+x);
		
		Set<Character> li = new TreeSet<Character>();
		li.add('A');
		li.add('a');
		li.add('3');
		li.add(' ');
		li.add('*');
		
		for(int z : li) {
			System.out.println(z);
		}		
	}
}
