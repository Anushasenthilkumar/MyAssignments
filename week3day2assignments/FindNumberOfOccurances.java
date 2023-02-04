package week3.week3day2assignments;
import java.util.*;
/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * a) Create Map -> TreeMap
 * b) For loop -> each number -> add to the map
 * c) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 * 
 */


public class FindNumberOfOccurances {

	public static void main(String[] args) {
		
		int [] inputArray = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> inputMap = new TreeMap<Integer, Integer>();
		
		for(int element : inputArray) {
			if(inputMap.containsKey(element)) {
				int existingValue = inputMap.get(element);
				inputMap.put(element, existingValue+1);				
			}else {
				inputMap.put(element, 1);	
			}
		}
		System.out.println(inputMap);
		
	}

}
