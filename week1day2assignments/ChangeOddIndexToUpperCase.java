package week1.week1day2assignments;
/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/

public class ChangeOddIndexToUpperCase {

		

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			String test = "adventure";
			char[] charArray = test.toCharArray();
			for(int i=1;i<charArray.length;i=i+2) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			for (int i = 0; i < charArray.length; i++) {
				System.out.print(charArray[i]);
			}

	}

}
