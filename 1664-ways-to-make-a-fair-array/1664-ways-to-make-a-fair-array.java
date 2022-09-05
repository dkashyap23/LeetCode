class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int[] pre_even_sum= new int[n];
        int[] pre_odd_sum=new int[n];
        pre_even_sum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
                pre_even_sum[i]=pre_even_sum[i-1]+nums[i];
            else
                pre_even_sum[i]=pre_even_sum[i-1];
        }
        pre_odd_sum[0]=0;
        for(int i=1;i<n;i++)
        {
            if(i%2!=0)
                pre_odd_sum[i]=pre_odd_sum[i-1]+nums[i];
            else
                pre_odd_sum[i]=pre_odd_sum[i-1];
        }
        // for(int i=0;i<n;i++)
        //     System.out.print(pre_even_sum[i]+" ");
        // System.out.println();
        // for(int i=0;i<n;i++)
        //     System.out.print(pre_odd_sum[i]+" ");
        // System.out.println();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int even_sum=0;
            int odd_sum=0;
            if(i==0)
            {
                even_sum=pre_odd_sum[n-1]-pre_odd_sum[i];
                odd_sum=pre_even_sum[n-1]-pre_even_sum[i];
            }
            else if(i==n-1)
            {
                even_sum=pre_even_sum[n-2]-nums[i];
                odd_sum=pre_odd_sum[n-2]-nums[i];
            }
            else
            {
                even_sum=pre_even_sum[i-1]+(pre_odd_sum[n-1]-pre_odd_sum[i]);
                odd_sum=pre_odd_sum[i-1]+(pre_even_sum[n-1]-pre_even_sum[i]);
            }
           // System.out.println(i+" "+even_sum+" "+odd_sum);
            if(even_sum==odd_sum)
                ans++;
        }
        return ans;
        
    }
}
/*
2 1 6 4

2  2  8 8

0 1 1 5

@1 
se=pre_even[i-1]+(ore_odd[n-1]-pre_odd[i])
so=pre_odd(i-1)+(ore_even[n-1]-pre_even[i])

*/