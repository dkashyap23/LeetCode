class Solution {
    public int maxScore(int[] card, int k) {
        int n=card.length;
        
        int[] pre=new int[n];
        pre[0]=card[0];
        for(int i=1;i<n;i++)
            pre[i]=pre[i-1]+card[i];
        int[] suff=new int[n];
        suff[n-1]=card[n-1];
        for(int i=n-2;i>=0;i--)
            suff[i]=suff[i+1]+card[i];
        if(k==n)
            return pre[n-1];
        
        int ans=Math.max(pre[k-1],suff[n-k]);
        int p=1;
        for(int i=k-2;i>=0;i--)
        {
            int t=pre[i]+suff[n-p];
            ans=Math.max(ans,t);
            p++;
        }
        return ans;
        
    }
}