package algo;

public class PacMan {

    /**
     * '.' = 1 point
     * 'o' = 10 points
     * 'x' = 100 points
     * 
     * level = multiplier for 'x'
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
    	
    	int score = 0;
    	int pointOne = 1;
    	int pointTen = 10;
    	int pointOneHundred =100;
    	
    	for(int row = 0; row < grid.length; row++) {
    		for(int col = 0; col < grid[row].length; col++) {
    			if(grid[row][col] == 'x') {
    				score = score + (pointOneHundred * level);
    			}
    			if(grid[row][col] == 'o') {
    				score = score + pointTen;
    			}
    			if(grid[row][col] == '.') {
    				score = score + pointOne;
    			}
    		}
    	}

        return score;
    }
}
