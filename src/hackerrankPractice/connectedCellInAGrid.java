package hackerrankPractice;

import java.util.Scanner;
import java.util.Stack;

public class connectedCellInAGrid {
	static int  max= -1;
	public static int getBiggestRegion(int[][] arr, int m, int n) {
		Stack stk = new Stack();
		Boolean[][]visited = new Boolean[m][n];
		//int max = Integer.MIN_VALUE;
		int cnt=0;
		//initialize visited array
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				visited[i][j]=false;
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				
				if(visited[i][j]==false){
					cnt=0;
					int runningCnt = DFS(i,j,arr,visited,cnt,m,n);
					/*if(runningCnt>max){
						max = runningCnt;
					}*/
				}
			
				
			}
		}
		
		return max;
      
    }
	public static int DFS(int i, int j, int[][]arr,Boolean[][]visited,int cnt,int row, int col){
		//int row = arr.length;
		//int col = arr[0].length;
		if(i< row && i>=0 && j<col && j>=0){
			System.out.println("i: "+i+" j: "+j);
			if(visited[i][j]==false && arr[i][j]==1){
				System.out.println("visited: "+visited[i][j]);
				
				
				cnt++;
				if (max<cnt)
					max=cnt;
				visited[i][j]=true;
				DFS(i+1,j+1,arr,visited,cnt,row,col);
				DFS(i,j+1,arr,visited,cnt,row,col);
				DFS(i+1,j,arr,visited,cnt,row,col);
				DFS(i-1,j+1,arr,visited,cnt,row,col);
				DFS(i+1,j-1,arr,visited,cnt,row,col);
				DFS(i,j-1,arr,visited,cnt,row,col);
				DFS(i-1,j,arr,visited,cnt,row,col);
				DFS(i-1,j-1,arr,visited,cnt,row,col);
			
			}
			else{
				visited[i][j] = true;
			}
		}
		return max;
	
		
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid, m,  n) );
    }
}
