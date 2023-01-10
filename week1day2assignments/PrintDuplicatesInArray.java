package week1.week1day2assignments;
//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

import java.util.Arrays;

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// print the matching value
public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {8,1,7,6,5,1,2,7,3,1,5,6,6,6,1,2};
		//int[] uniqueValues= num;
		Arrays.sort(num);
		
		System.out.println("Duplicate numbers");
		for(int i=0;i<num.length-1;i++) {
			boolean flag=false;
			if(num[i]==num[i+1]) {
				if(i!=0) {
					if(num[i]==num[i-1])
						continue;
				}
				System.out.print(num[i]+" ");
				
			}
		}

	}

}
