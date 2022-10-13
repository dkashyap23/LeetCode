class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
            pre[i]=pre[i+1]+nums[i];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(sum==pre[i])
                return i;
                
        }
        return -1;
        
    }
}