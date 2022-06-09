class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] ans=new int[2];
        int n=num.length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            if(num[start]+num[end]==target)
            {
                ans[0]=start+1;
                ans[1]=end+1;
                break;
            }
            else if(num[start]+num[end]<target)
                start++;
            else
                end--;
           // System.out.println(start+" "+end);
        }
        return ans;
    }
}