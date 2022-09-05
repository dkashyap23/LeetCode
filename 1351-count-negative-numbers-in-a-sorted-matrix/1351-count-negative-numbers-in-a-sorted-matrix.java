class Solution {
    public int countNegatives(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int i=r-1;
        int j=0;
        int count=0;
        while(i>=0 && j<c)
        {
            if(grid[i][j]<0)
            {
                count+=(c-j);
                i--;
            }
            else
                j++;
            
        }
        return count;
    }
}