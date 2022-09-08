package week1.day2assignment;

public class FindIntersection {

	public static void main(String[] args) {
		 
		
			int numA []= {3,2,11,4,6,7};		
			int numB []= {1,2,8,4,9,7};
			for(int i = 0, len = numA.length; i < len; i++){
				
				for(int j = 0, len2 = numB.length; j < len2; j++){
					if(numA[i]==numB[j])
					{
						System.out.println("Value :"+numA[i]+" is match");
					}
				}
			
			}
			
			
	}

}
