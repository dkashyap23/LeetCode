class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int[] temp=new int[n*n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                temp[x++]=matrix[i][j];
        }
        Arrays.sort(temp);
        return temp[k-1];
        
    }
}
/*
1  5  9
10 11 13
12 13 15

*/