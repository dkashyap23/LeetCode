class Solution {
    public int maxProduct(int[] nums) {
        int largest=-1;
        int sec_largest=-1;
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                largest=nums[i];
                ind=i;
            }
                
                
            // if(nums[i]>sec_largest && sec_largest<largest)
            //     sec_largest=nums[i];
        }
        nums[ind]=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>sec_largest)
                sec_largest=nums[i];
        }
        System.out.println(largest+" "+sec_largest);
        return (largest-1)*(sec_largest-1);
        
    }
}
