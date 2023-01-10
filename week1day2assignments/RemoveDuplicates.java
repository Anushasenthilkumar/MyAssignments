package week1.week1day2assignments;
/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions we as in java week1";
		String [] worksArray=text.split(" ");
		for (int i = 0; i < worksArray.length-1; i++) {
			for (int j = i+1; j < worksArray.length; j++) {
				if(worksArray[i].equalsIgnoreCase(worksArray[j]))
					worksArray[j]="";
			}			
		}
		String withoutDup="";
		for (int i = 0; i < worksArray.length; i++) {
			if(worksArray[i]!="")
				if(i!=worksArray.length-1)
					withoutDup=withoutDup+worksArray[i]+" ";
				else
					withoutDup=withoutDup+worksArray[i];
				
		}
		System.out.println(" String without duplicates : "+withoutDup);
	}

}
