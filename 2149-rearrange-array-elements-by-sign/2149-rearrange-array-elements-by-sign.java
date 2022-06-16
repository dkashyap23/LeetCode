class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s=0;
        int e=0;
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
                pos[s++]=nums[i];
            else
                neg[e++]=nums[i];
        }
        s=0;
        e=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                nums[i]=pos[s++];
            else
                nums[i]=neg[e++];
        }
        return nums;
            
    }
}