class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        // if(n==1 && nums[0]==target)
        //     return 0;
        // if(n==1 && nums[0]!=target)
        //         return -1;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target==nums[mid])
                return mid;
            // if(nums[mid+1]<nums[mid] && target<nums[left])
            //     left=mid+1;
            // if(nums[left]>target && target<nums[mid])
            //     left=mid+1;
            if(nums[mid]>=nums[left])
            {
                if(target>=nums[left] && target<=nums[mid])
                    right=mid-1;
                else
                    left=mid+1;
            } 
            else
            {
                if( target>=nums[mid] && target<=nums[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
           
        }
        return -1;
        
    }
}
/*
[4,5,6,7,0,1,2]

1 2 3 4 5 6 7

7 1 2 3 4 5 6

*/