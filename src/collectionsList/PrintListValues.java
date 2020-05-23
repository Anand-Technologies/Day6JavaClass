package collectionsList;

import java.util.ArrayList;
import java.util.List;

public class PrintListValues {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		System.out.println("Iterate print using normal for loop");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("Iterate using Enhanced for loop");
		for(int x : li) {
			System.out.println(x);
		}
	}

}
