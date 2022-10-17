class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        int min_so_far=prices[0];
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min_so_far)
                min_so_far=prices[i];
            int diff=prices[i]-min_so_far;
            ans=Math.max(ans,diff);
            
        }
        return ans;
    }
}
/*
7 1 5 3 6 4
7 6 6 6 6 4
0 5 1 3 0 0

7 6 4 3 1
7 6 4 3 1
0 0 0 0 0 
*/