class NumMatrix {
    int[][] pre;
    
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        pre=new int[r+1][c+1];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                pre[i+1][j+1]=matrix[i][j]+pre[i+1][j]+pre[i][j+1]-pre[i][j];
            }
            
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return pre[row2+1][col2+1]-pre[row1][col2+1]-pre[row2+1][col1]+pre[row1][col1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */