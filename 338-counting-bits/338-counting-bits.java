class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        //ans[0]=0;
        for(int i=0;i<=n;i++)
        {
            int t=i;
            int count=0;
            while(t!=0)
            {
                if((t&1)==1)
                    count++;
                t=t>>1;
            }
            ans[i]=count;
        }
        return ans;
        
    }
}