class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n=nums.length;
        int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            int curr=nums[i];
            int prev=nums[i-1];
            //System.out.println(prev+" "+curr);
            if(prev>=curr)
            {
                ans+=prev-curr+1;
                nums[i]=prev+1;
            }
            
        }
        return ans;
        
    }
}
// 3 2 1 2 1 7
// 1 1 2 2 3 7
//