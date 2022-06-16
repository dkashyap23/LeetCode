class Solution {
    public int[] rearrangeArray(int[] nums) {
        //1st approach
        // int s=0;
        // int e=0;
        // int n=nums.length;
        // int[] pos=new int[n/2];
        // int[] neg=new int[n/2];
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]>0)
        //         pos[s++]=nums[i];
        //     else
        //         neg[e++]=nums[i];
        // }
        // s=0;
        // e=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(i%2==0)
        //         nums[i]=pos[s++];
        //     else
        //         nums[i]=neg[e++];
        // }
        // return nums;
        
        //2nd approach
        int n=nums.length;
        int[] ans=new int[n];
        int ind=0;
        int indneg=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                ans[ind]=nums[i];
                ind+=2;
            }
            else
            {
                ans[indneg]=nums[i];
                indneg+=2;
            }
        }
        return ans;
            
    }
}