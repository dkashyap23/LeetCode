class Solution {
    public boolean checkPerfectNumber(int nums) {
        if(nums==1)
            return false;
        int sum=1;
        for(int i=2;i*i<=nums;i++)
        {
            if(nums%i==0)
            {
                sum+=i;
                if((nums/i)!=i)
                    sum+=nums/i;
            }
        }
        System.out.print(sum);
        return sum==nums?true:false;
        
    }
}


/*
8 1 2 4 8

1 2 3 4 6
*/