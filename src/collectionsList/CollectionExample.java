package collectionsList;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add("Anand");
		li.add("a");
		li.add(50);
		li.add(true);
		li.add("Anand"); //List will allow DUPLICATE'S
		System.out.println(li);
	
	}

}
