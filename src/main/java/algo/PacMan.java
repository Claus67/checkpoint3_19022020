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
    	
    	char tmpChar = ' ';
    	int sum = 0;
    	System.out.println("Level: " + level);
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.println(grid[i][j]);
				switch (grid[i][j]) {
				case '.':
					sum += 1;
					break;
				case 'o':
					sum += 10;
					break;
				case 'x':
					sum += 100 * level;
					break;
				default:
					break;
				}
			}
		}
    	System.out.println("Summe: " + sum);
        return sum;
    }
}
