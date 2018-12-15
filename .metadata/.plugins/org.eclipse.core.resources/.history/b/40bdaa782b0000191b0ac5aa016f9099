package com.bridgelabz.week3;

public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = Integer.parseInt(args[0]);
		    // x positions
		    int[] x = new int[n]; 
		    // y positions
	        int[] y = new int[n];        
	        // cells left to visit
	        int cellsToVisit = n*n;  
	       // number of steps taken
	        int steps = 0;                
	        double r;
	       // has the i-j been visited?
	        boolean[][] visited = new boolean[n][n];  
            
	        // start at center
	        for (int i = 0; i < n; i++) {
	            x[i] = n/2;
	            y[i] = n/2;
	        }
	        visited[n/2][n/2] = true;
	        cellsToVisit--;


	        // repeat until all cells have been visited
	        while (cellsToVisit > 0) {
	            steps++;

	            // move random walker i
	            for (int i = 0; i < n; i++) {
	                r = Math.random();
	                if(r <= 0.25) { 
	                	System.out.println(x[i]);
	                	x[i]++;
	            } else if (r <= 0.50) 
	                	x[i]--;
	                else if (r <= 0.75) 
	                	y[i]++;
	                else if (r <= 1.00) 
	                	y[i]--;

	                // check if (x[i], y[i]) is inside N-by-N boundary and has been visited
	                if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
	                    cellsToVisit--;
	                    visited[x[i]][y[i]] = true;
	                }
	            }
	        }

	        System.out.println("Number of steps " + steps);
	}

}
