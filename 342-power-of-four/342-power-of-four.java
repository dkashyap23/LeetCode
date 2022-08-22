class Solution {
    public boolean isPowerOfFour(int n) {
        int set_bit=0;
        int set_pos=0;
        for(int i=0;i<32;i++)
        {
            if(set_bit>1)
                return false;
            if((n&(1<<i))!=0)
            {
                set_bit++;
                set_pos=i+1;
                //System.out.println("*****  "+i);
            }
        }
        if(set_pos%2!=0)
            return true;
        return false;
    }
}
/*
1---0001
4---0100
8-- 10000
*/