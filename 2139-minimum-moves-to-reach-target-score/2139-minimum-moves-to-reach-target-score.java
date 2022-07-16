class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans=0;
        while(target>1)
        {
            if(maxDoubles==0)
            {
                return ans+(target-1);
            }
            if((target&1)==0 && maxDoubles>0)
            {
                target=target>>1;
                maxDoubles--;
            }
            else
                target--;
            ans++;
                
        }
        return ans;
        
    }
}
