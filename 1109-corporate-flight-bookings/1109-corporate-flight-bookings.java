class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];
        for(int i=0;i<bookings.length;i++)
        {
            int s=bookings[i][0];
            int e=bookings[i][1];
            for(int j=s;j<=e;j++)
                ans[j-1]+=bookings[i][2];
            
        }
        return ans;
        
    }
}