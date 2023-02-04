package week3.week3day2assignments;

import java.util.*;

//Declare a String as "PayPal India"

//Convert it into a character array

//Declare a Set as charSet for Character

//Declare a Set as dupCharSet for duplicate Character

//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print it


public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "PayPal India";
		text=text.toLowerCase();
		char[] charArray = text.toCharArray();
		Set <Character> charSet = new LinkedHashSet<Character>();
		Set <Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (Character character : charArray) {
			if(character!=' ') {
				if(!charSet.add(character)) {
					dupCharSet.add(character);
				}
			}
		}
		
		//System.out.println(charSet);
		//System.out.println(dupCharSet);
		
		charSet.removeAll(dupCharSet);
		System.out.println("Unique characters : "+charSet);

	}

}
