package HashMap;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
	
	public int compare(Employee a,Employee b) {
		
		return a.getId()-b.getId();
	}

}
