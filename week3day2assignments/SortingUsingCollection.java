package week3.week3day2assignments;

import java.util.*;

//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companies= {"HCL", " Wipro ","  Aspire Systems","CTS "};
		
		List <String> companiesList = new ArrayList<String> ();
		
		for (String string : companies) {
			companiesList.add(string.trim());			
		}
		
		Collections.sort(companiesList);
		System.out.println(companiesList);
		
		List <String> descOrderCompaniesList = new ArrayList<String> ();
		
		for(int i=companiesList.size()-1;i>=0;i--) {
			descOrderCompaniesList.add(companiesList.get(i));
		}
		System.out.println(descOrderCompaniesList);

	}

}
