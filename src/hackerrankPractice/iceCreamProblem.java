package hackerrankPractice;
/*
 * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together  dollars for ice cream. 
 * On any given day, the parlor offers a line of  flavors. Each flavor, , 
 * is numbered sequentially with a unique ID number from  to  and has a cost, , associated with it.

Given the value of  and the cost of each flavor for  trips to the Ice Cream Parlor, 
help Sunny and Johnny choose two distinct flavors such that they spend their entire pool of money () during each visit.
 For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny 
purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class IceCream implements Comparable{
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
      this.flavor = flavor;
      this.index = index;
    }

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int value = ((IceCream)o).flavor;
		return (flavor-value);
	}      
}

public class iceCreamProblem {
   
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
		int mid = (first+last)/2;
		if(arr[mid].flavor == search){
			return arr[mid].index;
		}
		if(arr[mid].flavor > search && first<last){
			
			return binarySearch(first,mid-1,arr,search);
			
		}
		else if(first<last){
			return binarySearch(mid+1,last,arr,search);
		}
			
		
    	return -1;
        
        
    }

    public static void main(String[] args) {
        
        int t;
        int n, m;
 
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
       for(int test = 0; test < t; test++) {       
            
            m = in.nextInt();
            n = in.nextInt(); 
            IceCream[] arr = new IceCream[n];
    
            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);
          //  IceCream[]CopyArr = arr.co
            Arrays.sort(arr);
            for (int k=0;k<arr.length;k++){
            	System.out.println(arr[k].flavor);
            }
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < n - 1 ; i++) {
                int search = m - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, n - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            } 
            
        }
        
    }
                        
}
