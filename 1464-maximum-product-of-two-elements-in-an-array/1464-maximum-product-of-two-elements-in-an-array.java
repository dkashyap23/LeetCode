class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int sec_largest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                sec_largest=largest;
                largest=nums[i];  
            }
            else if(nums[i]>sec_largest)
                sec_largest=nums[i];
                
            // if(nums[i]>sec_largest && sec_largest<largest)
            //     sec_largest=nums[i];
        }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]>sec_largest && sec_largest<largest)
        //         sec_largest=nums[i];
        // }
        System.out.println(largest+" "+sec_largest);
        return (largest-1)*(sec_largest-1);
        
    }
}
