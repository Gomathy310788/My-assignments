package week3assignment;

public class FindSecondLargest {

	public static void main(String[] args) {
		// int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		int[] data = {3,2,11,4,6,7};
		int temp=0;
		System.out.println("Original Array: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]+" ");
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if(data[i]<data[j]) {
				temp=data[i];
				data[i]=data[j];
				data[j]=temp;
				}
			}
			}
		System.out.println("Array sorted in ascending order");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]+" ");
			
		}
		System.out.println("2nd element from the last");
		System.out.println(data[1]);
		

	}

}
