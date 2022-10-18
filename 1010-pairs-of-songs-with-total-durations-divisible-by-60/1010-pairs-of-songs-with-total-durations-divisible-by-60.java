class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<time.length;i++)
        {
            int t=time[i]%60;
            int diff=(60-t)%60;
            if(mp.containsKey(diff))
            {
                ans+=mp.get(diff);
            }
            mp.put(t,mp.getOrDefault(t,0)+1);
            
        }
        return ans;
        
    }
}