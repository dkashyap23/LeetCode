class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        if(n==1)
            return nums[0];
        if(nums[left]<nums[right])
                return nums[0];
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];
            if(nums[mid-1]>nums[mid])   
                return nums[mid];
            if(nums[mid]>nums[0])
                left=mid+1;
            else
                right=mid-1;
            
        }
        return -1;
        
    }
}
/*
1 2 3 4 5 6
2 3 4 5 6 1
5 6 1 2 3
*/