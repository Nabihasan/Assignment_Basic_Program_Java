package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<ComparableExample> c=new ArrayList<>();
		c.add(new ComparableExample(124,"aamir",7000.0));
		c.add(new ComparableExample(111,"habib",9800.0));
		c.add(new ComparableExample(120,"hasan",117000.0));
		
		System.out.println(c);
		Collections.sort(c,new ID_Comparator());
		//comparable
		System.out.println(c);
		
		ArrayList<ComparableExample> c1=new ArrayList<>();
		Collections.sort(c1,new NameComparator());
		System.out.println(c1);
	}

}
