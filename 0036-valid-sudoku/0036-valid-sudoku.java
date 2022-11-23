class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char c=board[i][j];
                if(c!='.')
                {
                    // System.out.println(c);
                    if(set.contains("Row"+i+c)||
                       set.contains("Col"+j+c) ||
                       set.contains("Box"+(i/3)*3+j/3+c))
                    {
                       return false;
                    }
                    else
                       {
                           set.add("Row"+i+c);
                           set.add("Col"+j+c);
                           set.add("Box"+(i/3)*3+j/3+c);
                       }
                }
            }
        }
        return true;
        
    }
}