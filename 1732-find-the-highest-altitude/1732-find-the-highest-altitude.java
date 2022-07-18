class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] alt=new int[n+1];
        alt[0]=0;
        int ans=alt[0];
        for(int i=1;i<n+1;i++)
        {
                alt[i]=alt[i-1]+gain[i-1];
            ans=Math.max(ans,alt[i]);
        }
        return ans;
        
    }
}