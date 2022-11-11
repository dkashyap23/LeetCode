class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int s=1;
        int e=1;
        int ans=1;
        while(e<n)
        {
           if(nums[e]==nums[e-1]) 
               e++;
            else
            {
                nums[s]=nums[e];
                s++;
                e++;
                ans++;
            }
        }
        return ans;  
    }
}