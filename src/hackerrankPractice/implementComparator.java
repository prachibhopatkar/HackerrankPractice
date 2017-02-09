
/*
 * Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; 
 * if  or more players have the same score, sort those players alphabetically by name. To do this, 
 * you must create a Checker class that implements the Comparator interface, 
 * then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
 */
package hackerrankPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker1 implements Comparator{
	

	public int compare(Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(((Player)p1).score != ((Player)p2).score){
            return (((Player)p1).score - ((Player)p2).score)*-1;
        }
        else{
            String name1  = ((Player)p1).name;
            String name2 =  ((Player)p2).name;
            return (name1.compareTo(name2));
        }
	}	
}

public class implementComparator {
	

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player[] player = new Player[n];
	        Checker1 checker = new Checker1();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();
	     
	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }
	    }
	
}
