class Solution {
    public int countPrimes(int n) {
        int ans=0;
        int[] prime=new int[n];
        for(int i=2;i<n;i++)
        {
            if(prime[i]==0)
            {
                ans++;
                for(int j=2;i*j<n;j++)
                    prime[i*j]=1;
            }
        }
        return ans;
    }
}