class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] pre=new int[n];
        int[] suff=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++)
                pre[i]=pre[i-1]+nums[i];
        suff[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
            suff[i]=suff[i+1]+nums[i];
        ans[0]=suff[0]-nums[0]*n;
        ans[n-1]=nums[n-1]*n-pre[n-1];
        for(int i=1;i<n-1;i++)
        {
            int x=((nums[i]*i-pre[i-1])+(suff[i+1]-nums[i]*(n-i-1)));
            ans[i]=x;
        }
        return ans;
    }
}
/*
2 3 5 

2 5 10 
10 8 5

suff[0]-nums[0]*n   10-2*3
(num*i-pre[i-1])+(suff[i+1]-num[i]*(n-i-1))     (3-2)+(8-3*2);

sum=((nums[i]*i)-prefixSum[i-1])+(suffixSum[i+1]-(nums[i]*(n-i-1)));

1 4 6 8 10

1 5 11 19 29  Pre
29 28 24 18 10 Suf

0->29-1*5=24
1->




*/