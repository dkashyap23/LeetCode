class Solution {
    public int maximumUnits(int[][] bt, int truckSize) {
        Arrays.sort(bt,(x, y) -> y[1] - x[1]);
        int ans=0;
        for(int i=0;i<bt.length;i++)
        {
            // if(truckSize==0)
            //     break;
            if(bt[i][0]<=truckSize)
            {
              ans+=(bt[i][0]*bt[i][1]);
                truckSize-=bt[i][0];
            }
            else
            {
               ans+=truckSize*bt[i][1];
                break;
            }
        }
        return ans;
    }
}
