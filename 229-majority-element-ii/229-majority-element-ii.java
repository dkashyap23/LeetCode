class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int candidate1=Integer.MIN_VALUE;
        int candidate2=Integer.MIN_VALUE;
        int life1=0;
        int life2=0;
        for(int i=0;i<n;i++)
        {
            if(candidate1==nums[i])
                life1++;
            else if(candidate2==nums[i])
                life2++;
            else if(life1==0)
            {
                candidate1=nums[i];
                life1=1;
            }
            else if(life2==0)
            {
                candidate2=nums[i];
                life2=1;
            }
            else
            {
                life1--;
                life2--;
            }
        }
        life1=0;
        life2=0;
        for(int i=0;i<n;i++)
        {
            if(candidate1==nums[i])
                life1++;
            if(candidate2==nums[i])
                life2++;
        }
        if(life1>(n/3) && life2>(n/3))
        {
            ans.add(candidate1);
             ans.add(candidate2);
        }
        else if(life1>n/3)
             ans.add(candidate1);
        else if(life2>n/3)
             ans.add(candidate2);
        return ans;
    }
}