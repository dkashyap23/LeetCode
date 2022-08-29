class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[0]+nums[n-1];
        for(int i=1;i<n/2;i++)
            max=Math.max(max,(nums[i]+nums[n-i-1]));
        return max;
        
    }
}
//[4,1,5,1,2,5,1,5,5,4]
//1 1 1 2 4 4 5 5 5 5