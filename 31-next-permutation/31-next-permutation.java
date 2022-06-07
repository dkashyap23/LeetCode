class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind1=0;
        int ind2=0;
        int i;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                ind1=i;
                break;
            }
        }
      //  System.out.println(i);
        if(i>=0)
        {
        
            for(i=n-1;i>=0;i--)
            {
                if(nums[i]>nums[ind1])
                {
                    ind2=i;
                    break;
                }
            }
            int t=nums[ind1];
            nums[ind1]=nums[ind2];
            nums[ind2]=t;
            
        }
        else
            ind1=-1;
        int s=ind1+1;
        int e=n-1;
        while(s<=e)
        {
           int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t; 
            s++;
            e--;
        }
        
        
    }
}