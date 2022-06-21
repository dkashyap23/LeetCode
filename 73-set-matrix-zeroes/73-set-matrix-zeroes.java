class Solution {
    public void setZeroes(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        Set<Integer> row=new HashSet<Integer>();
        Set<Integer> col=new HashSet<Integer>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(row.contains(i) || col.contains(j))
                    mat[i][j]=0;
            }
        }
       
    }
}