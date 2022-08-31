class Solution {
    public int minOperations(int[] nums) {
        int max=nums[0];
        int max_ind=0;
        int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]>max)
        //     {
        //         max=nums[i];
        //         max_ind=i;
        //     }
        // }
        // System.out.println(max+" "+max_ind);
        int ans=0;
        // if(max_ind==-1)
        //     return 0;
        for(int i=1;i<n;i++)
        {
            // ans+=(max-nums[i]+1);
            // max=max+1;
            if(nums[i-1]>=nums[i])
            {
                ans+=(nums[i-1]-nums[i]+1);
                nums[i]=nums[i-1]+1;
            }
            System.out.print(nums[i]+" ");
        }
        return ans;
    }
}
// 1 5 2 4 1
// 1 5 6 7 8
//0 0  4 