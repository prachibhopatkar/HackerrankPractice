package hackerrankPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class reverseArray {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int front = 0;
        int back=k-1;
        int temp=0;
        System.out.println("I am in function");
        while(front<back){
            temp = a[front];
            a[front] = a[back];
            a[back]=temp;
            front++;
            back--;
        }
        front = k;
        back = n-1;
        while(front<back){
            temp = a[front];
            a[front] = a[back];
            a[back]=temp;
            front++;back--;
        }
        
        //reverse the entire array
        front=0;
        back = n-1;
        while(front<back){
            temp = a[front];
            a[front] = a[back];
            a[back]=temp;
            front++;back--;
        }
        return a;
    
       
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of numbers");
        int n = in.nextInt();
        System.out.println("Enter Rotation number");
        int k = in.nextInt();
        
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = a_i;
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
