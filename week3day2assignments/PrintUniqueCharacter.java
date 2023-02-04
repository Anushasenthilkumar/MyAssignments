package week3.week3day2assignments;
import java.util.*;
//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name = "Anusha Senthil Kumar";
		name=name.toLowerCase();
		Set <Character> charSet = new HashSet<Character>();
		for(int i=0;i<name.length();i++) {
			charSet.add(name.charAt(i));
		}
		
		String uniqueChars="";
		List <Character> charList = new ArrayList<Character>(charSet);
		
		for (int i=0;i<charList.size();i++) {
			if(charList.get(i)!=' ') {
				if(i==charList.size()-1) {
					uniqueChars=uniqueChars+charList.get(i);
				}else {
					uniqueChars=uniqueChars+charList.get(i)+" ";
				}
			}				
		}
		System.out.println(uniqueChars);

	}

}
