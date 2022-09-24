package week3assignment;

public class ChangeOddindextoUppercase {
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	public static void main(String[] args) {
		
		String test = "changeme";//ChAnGeMe ChAnGeMe
	        char[] ch=test.toCharArray();
	        
	        for(int i=0;i<ch.length;i++) {
	            if(i%2==0) {
	                ch[i]=Character.toUpperCase(ch[i]);
	            }
	        }
	        for(int i=0;i<ch.length;i++) {
	            System.out.print(ch[i]);
	        }
	         
	    }
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
	}

	//}

// public static void main(String[] args) {
//String text = "We learn java basics as part of java sessions in java week1";

//String word[]= text.split(" ");

//Set<String> words= new LinkedHashSet<String>();
//for(int i=0;i<word.length;i++) {
  //  words.add(word[i]);

//System.out.println(words);
//
