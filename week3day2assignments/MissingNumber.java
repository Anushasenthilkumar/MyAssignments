package week3.week3day2assignments;
/*
 * Problem 
 * 
 * There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {3,2,10,4,6,7,2,3,3,6,7,1,5,8};
		//int[] data = {3,6,3,2,5,4,2};
		Set <Integer> setData = new TreeSet<Integer>();
		for (int integer : data) {
			setData.add(integer);
		}
		//System.out.println(setData);
		List <Integer> listData=new ArrayList<Integer>(setData);
		System.out.println(listData);
		for(int i=0;i<listData.size();i++) {
			if((i+1)!=listData.get(i)) {
				System.out.println("Missing Number is : "+(i+1));
				break;
			}
		}
		

	}

}
