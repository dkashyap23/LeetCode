class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
                return false;
        double ans=0;
        ans=Math.log10(n)/Math.log10(3);
        if(ans%1==0)
            return true;
        else
            return false;
        
    }
}
