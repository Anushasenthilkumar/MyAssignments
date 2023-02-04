package week3.week3day2assignments;
import java.util.*;
//Find the most duplicate number -> First most duplicate
	/*
	* input: abbaba
	* output: b
	* 
	* 
	*/

	/*
	 * Psuedocode
	 * 
	 * a) Map -> HashMap 
	 * b) String -> ch[] -> Get all the character -> occurance
	 * c) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */


public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		
		String input ="abbaba";
		input=input.toLowerCase();
		char [] charInput=input.toCharArray();
		Map<Character,Integer> Mapchar= new HashMap<Character,Integer>();
		int maxOccurance=0;
		Character maxOccuredChar=null;
		for (char c : charInput) {
			if(Mapchar.containsKey(c)) {
				int existingOccurance=Mapchar.get(c);
				Mapchar.put(c, existingOccurance+1);
			}else {
				Mapchar.put(c, 1);
			}
			if(Mapchar.get(c)>maxOccurance) {
				maxOccurance=Mapchar.get(c);
				maxOccuredChar=c;
			}
		}
		System.out.println("Maximum occured Character : "+maxOccuredChar);
		System.out.println(Mapchar);

	}

}
