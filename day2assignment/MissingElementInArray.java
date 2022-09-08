package week1.day2assignment;

import java.util.Arrays;
import java.util.Iterator;


public class MissingElementInArray {
	
	    public static void main(String[] args)
	    {
	
		
	        findMissingNo();
    
        }
	    public static void findMissingNo()
	    {
	    	int[] arr1 = {1,2,3,4,7,6,8};
	    	Arrays.sort(arr1);
	       //System.out.println(Arrays.toString(arr1));
	        
	        for (int i = 0; i < arr1.length;i++)
	        {
	        		if (arr1[i]+1 != arr1[i+1])
	        		{
	           			System.out.println(arr1[i]+1);
	        			break;
	        		}
	        }
	    }
        		
        }

