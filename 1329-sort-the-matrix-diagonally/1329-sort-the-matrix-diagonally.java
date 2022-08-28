class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        
        for(int i=0;i<col;i++)
        {
           sort(mat,0,i,row,col); 
        }
        for(int i=1;i<row;i++)
        {
            sort(mat,i,0,row,col);  
        }
        return mat;
    }
     void sort(int[][] mat,int n,int m,int row,int col)
    {
        int r=n;
        int c=m;
        int[] temp=new int[101];
        while(r<row && c<col)
        {
            temp[mat[r][c]]++;
            r++;
            c++;
        }
        r=n;
        c=m;
        for(int i=0;i<101;i++)
        {
            int count=temp[i];
            while(count>0)
            {
                mat[r][c]=i;
                r++;
                c++;
                count--;
            }
        }
        
    }
}