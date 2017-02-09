package hackerrankPractice;
import java.util.*;

public class hashTablesRansomNote {
    Map<String, Integer> magazineMap ;
   // Map<String, Integer> noteMap;

    
    public hashTablesRansomNote(String magazine, String note) {
    	magazineMap = new HashMap<String,Integer>();
    	//noteMap = new HashMap<String,Integer>();
        String[]mag = magazine.split(" ");
        String[]no = note.split(" ");
        for(int i=0;i<mag.length;i++){
        	if(magazineMap.get(mag[i])!=null)
        		magazineMap.put(mag[i], magazineMap.get(mag[i])+1);
        	else
        		magazineMap.put(mag[i], 1);
        }
       /* for(int j=0;j<no.length;j++){
        	if(noteMap.get(no[j])!=null)
        		noteMap.put(no[j], noteMap.get(no[j])+1);
        	else
        		noteMap.put(no[j], 1);
        }*/
        solve(no,mag);
    }
    
    public void solve(String[]str, String[]mag) {
    	//Iterator itr = noteMap.entrySet().iterator();
    	if (mag.length<str.length){
    		System.out.println("No");
    		return;
    	}
    	for(int i=0;i<str.length;i++){
    		if(magazineMap.get(str[i])>0){
    			magazineMap.put(str[i],magazineMap.get(str[i]) -1);
    		}
    		else{
    			System.out.println("No");
        		return;
    		}
    			
    	}
    	System.out.println("Yes");
    	
		
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        hashTablesRansomNote note = new hashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
       // boolean answer = note.solve();
        //if(answer)
          //  System.out.println("Yes");
        //else System.out.println("No");
      
    }
}



