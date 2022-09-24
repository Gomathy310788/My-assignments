package week3assignment;

public class Palindrome {

	public static void main(String[] args) {
		/* a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		 String str= "MaDam";
	        
		 String reversestr="";
	        
	        for(int i=str.length()-1;i>=0;i--)
	        {
	         
	        	reversestr=reversestr+str.charAt(i);
	        
	        } if(str.equalsIgnoreCase(reversestr))
	        {
	            System.out.println("its a palindrome string");
	        }else {
	            System.out.println("its not palinrome string");
	        }
	}

}
