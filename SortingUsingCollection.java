package homeAssignment.week3_2;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("HCL");
		al.add("CTS");
		al.add("Wipro");
		al.add("Aspire Sysytems");
		System.out.println(al);
	    Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

	}

}
