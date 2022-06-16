public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int p=0;
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int lsb=n&1;
            lsb=lsb<<(31-i);
            ans=ans|lsb;
            n=n>>1;
        }
        return ans;
        //} 
    }
}