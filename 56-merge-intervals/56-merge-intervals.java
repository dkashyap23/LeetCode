class Solution {
    public int[][] merge(int[][] itv) {
        int n=itv.length;
        Arrays.sort(itv,(i1,i2)->Integer.compare(i1[0],i2[0]));
        ArrayList<int[]> list=new ArrayList<>();
        list.add(itv[0]);
        for(int i=1;i<n;i++)
        {
            int curr_start=itv[i][0];
            int curr_end=itv[i][1];
            int prev_start=list.get(list.size()-1)[0];
            int prev_end=list.get(list.size()-1)[1];
            if(curr_start>prev_end)
                list.add(itv[i]);
            if(curr_start>=prev_start && curr_start<=prev_end)
            {
                list.remove(list.size()-1);
                int min_start=Math.min(prev_start,curr_start);
                int max_end=Math.max(prev_end,curr_end);
                int[] newintv=new int[2];
                newintv[0]=min_start;
                newintv[1]=max_end;
                list.add(newintv);
            }
        }
        int s=list.size();
        int[][] ans=new int[s][2];
        for(int i=0;i<s;i++)
        {
            ans[i][0]=list.get(i)[0];
            ans[i][1]=list.get(i)[1];
        }
        return ans;
        
    }
}