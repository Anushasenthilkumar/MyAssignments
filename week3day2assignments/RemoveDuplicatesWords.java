package week3.week3day2assignments;
import java.util.*;

/*
 * Pseudo code 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
 *
 *Output= We learn java basics as part of sessions in week1
 *
 * Psuedocode
 *
 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
 * c) Create a empty Set 
 * d) Iterate the String array
             d.1) add each word into Set
 * e) Print the Set values which is having unique words
 */


public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set <String> setText = new LinkedHashSet <String>();
		for(String word : split) {
			setText.add(word);
		}
		
		List<String> listText = new ArrayList<String>(setText);
		
		String duplicateRemovedText="";		
		
		for (int i=0;i<listText.size();i++) {
			if(i==listText.size()-1) {
				duplicateRemovedText=duplicateRemovedText+listText.get(i);
			}else {
				duplicateRemovedText=duplicateRemovedText+listText.get(i)+" ";
			}
			
		}

		System.out.println(duplicateRemovedText);
	}

}
