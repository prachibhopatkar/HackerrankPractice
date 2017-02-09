package hackerrankPractice;

import java.util.Scanner;
import java.util.Stack;

public class chkBalancedBracketsFrommixtureOfBrackets {
   
	public static boolean isBalanced(String expression) {
		if(expression == null)
			return true;
		char[]arr = expression.toCharArray();
		Stack stk = new Stack();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='('||arr[i]=='['||arr[i]=='{'){
				stk.push(arr[i]);
			}
			else{
				if(!stk.isEmpty()){
				char c = (Character) stk.pop();
				if(arr[i]==')'){
					if (c!='(')
					
						return false;			
				}
				else if(arr[i]==']'){
					if (c!='[')
						
						return false;			
				}
				else if(arr[i]=='}'){
					if (c!='{')
						return false;			
				}
				}
				else
					return false;
					
			}
			
		}
		if(!stk.isEmpty())
			return false;
		else
			return true;
        
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
