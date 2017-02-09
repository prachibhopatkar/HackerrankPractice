package hackerrankPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class makeAnagram {
    public static int numberNeeded(String first, String second) {
    	char a[] = first.toCharArray();
    	char b[] = second.toCharArray();
    	int arr[] = new int[26];
    	for(int i=0;i<a.length;i++){
    		arr[a[i]-'a'] = arr[a[i]-'a'] + 1;
    		
    	}
    	for(int j=0;j<b.length;j++){
    		arr[b[j]-'a'] = arr[b[j]-'a']-1;
    	}
    	int cntr=0;
    	for(int k=0;k<26;k++){
    		cntr+=Math.abs(arr[k]);
    	}
		return cntr;
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
