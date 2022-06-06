class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        //First make transope of the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        //Reverseing the rows 
        for(int i=0;i<n;i++)
        {
            int s=0;
            int e=n-1;
            while(s<e)
            {
                int x=mat[i][s];
                mat[i][s]=mat[i][e];
                mat[i][e]=x;
                s++;
                e--;
            }
        }
        //return mat;
    }
}