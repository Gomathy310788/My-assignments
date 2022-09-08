 package week1.day2assignment;

public class NegativetoPositive {

	public static void main(String[] args) {
		int number= -40;
		int positiveNumber = number;
		int n = positiveNumber* -1; 
		
		if (number < 0.0)
            System.out.println(number + " is a negative number.");

		if (number < 0) {
            positiveNumber = positiveNumber * (-1);
            System.out.println("Positive number: " + positiveNumber);
            System.out.println("The number -40 is converted to 40");
        }
	      
	   }
	}		

	

