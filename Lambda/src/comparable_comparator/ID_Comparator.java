package comparable_comparator;

import java.util.Comparator;

public class ID_Comparator implements Comparator<ComparableExample> {

	@Override
	public int compare(ComparableExample a, ComparableExample b) {
		
		return a.getEmpId()-b.getEmpId();
	}

}
