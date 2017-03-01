/*
 * Davis has  staircases in his house and he likes to climb each staircase , 
 *  or  steps at a time. Being a very precocious child,
 *   he wonders how many ways there are to reach the top of the staircase.
	Given the respective heights for each of the  staircases in his house, 
	find and print the number of ways he can climb each staircase on a new line.
 */
package hackerrankPractice;


import java.util.*;


public class NumberOfWaysToReachTopOfStaircase {
	static Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	public static int findNumberOfWay(int n){
		if(n==1){
			return 1;
		}
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		if(hm.containsKey(n))
			return (hm.get(n));
		else{
			if(n>1){
				 int sum = findNumberOfWay(n-1)+findNumberOfWay(n-2)+findNumberOfWay(n-3);
				 hm.put(n, sum);
				 return sum;
			}
		}
		
		return 0;
		
		
	}
	public static void main(String[] args) {
		Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
		
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int num = findNumberOfWay(n);
            System.out.println(num);
        }
    }
}
