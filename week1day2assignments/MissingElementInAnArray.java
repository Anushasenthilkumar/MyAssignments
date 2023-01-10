package week1.week1day2assignments;

import java.util.Arrays;

//Here is the input
		//int[] arr = {1,2,3,4,7,6,8};
		// Sort the array
		// loop through the array (start i from arr[0] till the length of the array)
			// check if the iterator variable is not equal to the array values respectively			
				// print the number				
				// once printed break the iteration

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,8};
		Arrays.sort(arr);
		int count=1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=count) {
				System.out.print(count+" ");
				i--;
			}
			count++;
		}
	}

}
