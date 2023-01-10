
package week1.week1day2assignments;
//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

/* Pseudo Code: 
 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] wordsArray=test.split(" ");
		for (int i = 1; i < wordsArray.length; i+=2) {
			char[] evenWorsArray=wordsArray[i].toCharArray();
			char[] reversedEvenWordsArray=new char[evenWorsArray.length];
			int z=0;
			for (int j = evenWorsArray.length-1; j >=0; j--) {
				reversedEvenWordsArray[z]=evenWorsArray[j];
				z++;
			}
	
			wordsArray[i]=String.valueOf(reversedEvenWordsArray);
		}
		System.out.println("String after reversing the even words");
		for (int i = 0; i < wordsArray.length; i++) {
			if(i!=wordsArray.length-1)
				System.out.print(wordsArray[i]+" ");
			else
				System.out.print(wordsArray[i]);
		}
		
	}

}
