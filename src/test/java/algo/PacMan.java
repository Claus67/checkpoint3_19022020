
package algo;

public class PacMan {

    /**
     *
     * @param grid, eg: {
     *     {'o', '.', '.'},
     *     {' ', 'x', ' '},
     *     {'.', '.', 'o'}
     * }
     * @param level, eg: 2
     * @return score, eg: 224
     */
    public static int play(char[][] grid, int level) {
    	
    	// TODO Auto-generated method stub
    	int score = 0;
    	
    	
    	for (int row = 0; row < grid.length; row++) {
			//System.out.println(grid.length);
  
    		for (int column = 0; column < grid[row].length; column++) {
				//System.out.println(grid[row][column]);
    			
    			switch (grid[row][column]) {
    			case '.':
    				score = score + 1;
    				break;
    			case 'o':
    				score = score + 10;
    				break;
    			case 'x':
    				score = score + (100*level);
    				break;

    			default:
    				break;
    			}
    			
    			
    			
    			
			}
    		
		}
		
    	
    	

        return score;
    }

	
}






