package hackerrankPractice;

import java.util.Scanner;
import java.util.Stack;

public class implementQueueUsingTwoStacks {
	public static class MyQueue<T> {
        Stack<T> stackForEnqueue = new Stack<T>();
        Stack<T> stackForDequeue = new Stack<T>();

        public void enqueue(T value) { 
        	stackForEnqueue.push(value);
        }

        public T peek() {
             if(!stackForDequeue.isEmpty())
            	 return stackForDequeue.peek();
             else{
            	 transfer();
            		if(!stackForDequeue.isEmpty())
            			return stackForDequeue.peek();
                   	else 
                   		return null;
            	 }
          }

        public T dequeue() {
        	if(!stackForDequeue.isEmpty())
        		return stackForDequeue.pop();
            else{
           	 transfer();
           	if(!stackForDequeue.isEmpty())
           		return stackForDequeue.pop();
           	else 
           		return null;
            }
            
        }
        public void transfer(){
        	while(!stackForEnqueue.isEmpty()){
        		stackForDequeue.push(stackForEnqueue.pop());
        	}
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
