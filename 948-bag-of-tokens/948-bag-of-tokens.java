class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int l=0;
        int r=n-1;
        int ans=0;
        int score=0;
        while(l<=r)
        {
            if(tokens[l]<=power)
            {
                score++;
                power-=tokens[l];
                l++;
                ans=Math.max(ans,score);
            }
            else if(tokens[l]>power && score>0)
            {
                score--;
                power+=tokens[r];
                r--;
            }
            else
                return ans;
                
        }
        return ans;
        
    }
}