package week3assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		 int[] a= {3,2,11,4,6,7};
		    
		    int[] b= {1,2,4,8,9,7};
		    
		    List<Integer> list1= new ArrayList<Integer>();//3,2,11,4,6,7
		    
		    List<Integer> list2= new ArrayList<Integer>();// 1,2,4,8,9,7
		    
		    for(int i=0;i<a.length;i++) {
		        list1.add(a[i]);
		        list2.add(b[i]);
		    }
		    //a[i]
		    for(int j=0;j<list1.size();j++) {
		        //b[i]
		        for(int k=0;k<list2.size();k++) {
		            if(list1.get(j)==list2.get(k)) {
		                System.out.println(list1.get(j));
		            }
		        }
		    }
		    

	}

}
