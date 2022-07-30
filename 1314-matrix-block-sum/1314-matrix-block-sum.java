class Solution {
    public int[][] matrixBlockSum(int[][] A, int k) {
        int n=A.length;
        int m=A[0].length;
        long[][] presum=new long[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                    presum[i][j]=A[i][j];
                else
                    presum[i][j]=A[i][j]+presum[i][j-1];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                presum[j][i]=presum[j-1][i]+presum[j][i];
            }
        }
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                int a1=i-k;
                int b1=j-k;
                int a2=i+k;
                int b2=j+k;
                if(a2>n-1)
                    a2=n-1;
                if(b2>m-1)
                    b2=m-1;
                long sum=presum[a2][b2];
                if(a1>0)
                    sum-=presum[a1-1][b2];
                if(b1>0)
                    sum-=presum[a2][b1-1];
                if(a1>0 && b1>0)
                    sum+=presum[a1-1][b1-1];
                //System.out.println(sum);
                ans[i][j]=(int)sum;
            }
        }
        return ans;
        
    }
}