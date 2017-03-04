/*
 * Given , complete the fibonacci function so it returns .
 */
package hackerrankPractice;

import java.util.Scanner;

public class fibonacciNumber {
	public static int fibonacci(int n) {
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int num = fibonacci(n-1)+fibonacci(n-2);
		return num;
        // Complete the function.
      
      
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
