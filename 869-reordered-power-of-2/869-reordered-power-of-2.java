class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] arr_n=fre_count(n);
        
        int num=1;
        for(int i=0;i<30;i++)
        {
            if(Arrays.equals(fre_count(num),arr_n))
                return true;
            num=num<<1;
        }
        return false;
    }
    int[] fre_count(int n)
    {
        int[] temp=new int[10];
        while(n>0)
        {
            temp[n%10]++;
            n=n/10;
        }
        return temp;
    }
        
}