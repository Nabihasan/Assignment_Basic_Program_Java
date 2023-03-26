package comparable_comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparableExample> {

	@Override
	public int compare(ComparableExample o1, ComparableExample o2) {
	
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

	

}
