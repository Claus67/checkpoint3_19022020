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
    	int score = 0;

    	for (int i=0; i<grid.length; i++) {
    		for (int j=0; j<grid[i].length; j++) {
    			switch (grid[i][j]) {
    			case '.':
    				score += 1;
    				break;
    			case 'o':
    				score += 10;
    				break;
    			case 'x':
    				score += (100 * level);
    				break;
    			}
    			
    		}
    	}

        return score;
    }
}
