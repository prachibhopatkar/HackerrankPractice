package hackerrankPractice;

import java.util.Scanner;

public class checkForPrimeNumber {
	
		public static boolean isPrime(int num){
			if(num==1)
				return false;
			for(int i =2;i<=Math.sqrt(num);i++){
				if(num%i == 0)
					return false;
			}
			return true;
			
		}
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int p = in.nextInt();
	        int[]input = new int[p];
	        for(int a0 = 0; a0 < p; a0++){
	            int n = in.nextInt();
	            input[a0]=n;
	        }
	        for(int j=0;j<p;j++){
	        	if(isPrime(input[j])){
	            	System.out.println("Prime");
	            }
	            else{
	            	System.out.println("Not prime");
	            }
	        }
	        
	        
	    }
}
