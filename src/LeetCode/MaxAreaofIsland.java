package LeetCode;


/**
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 * <p>
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 * <p>
 * Example 1:
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,1,1,0,1,0,0,0,0,0,0,0,0],
 * [0,1,0,0,1,1,0,0,1,0,1,0,0],
 * [0,1,0,0,1,1,0,0,1,1,1,0,0],
 * [0,0,0,0,0,0,0,0,0,0,1,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
 * Example 2:
 * [[0,0,0,0,0,0,0,0]]
 * Given the above grid, return 0.
 * Note: The length of each dimension in the given grid does not exceed 50.
 */

public class MaxAreaofIsland {
    /**
     * 1. loop grid, and DFS if meet 1, to count the number of 1.
     * 2. compare and store to max.
     * 3. turn around the 1 to make it as visited.
     *
     */
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int max = 0;
        for(int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[0].length; j ++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, helper(grid, i, j , 1));
                }
            }
        }

        return max;
    }

    private int helper(int[][] grid, int i, int j, int res) {
        grid[i][j] = 0;
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            res = helper(grid,i - 1, j, res + 1);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            res = helper(grid,i, j - 1, res + 1);
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
            res = helper(grid,i + 1, j, res + 1);
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
            res = helper(grid,i, j + 1, res + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] i = {{0,1,0,0,1,1,1}};
        MaxAreaofIsland maxAreaofIsland = new MaxAreaofIsland();
        System.out.println(maxAreaofIsland.maxAreaOfIsland(i));
    }
}
