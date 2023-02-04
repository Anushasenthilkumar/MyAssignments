package week3.week3day2assignments;

import java.util.*;

//Here is the input
//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */


public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set <Integer> setData = new TreeSet<Integer>();
		for (int integer : data) {
			setData.add(integer);
		}
		//System.out.println(setData);
		List <Integer> listData=new ArrayList<Integer>(setData);		
		System.out.println("Second Largest : "+listData.get(listData.size()-2));
		

	}

}
