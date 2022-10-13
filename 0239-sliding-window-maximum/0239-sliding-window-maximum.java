class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> temp_ans=new ArrayList<>();
        Deque<Integer> q=new LinkedList<>();
        int n=nums.length;
        int s=0;
        int e=0;
        while(s<=e && e<n)
        {
            if(q.isEmpty())
            {
                q.add(nums[e]);
                //e++;
            }
            else if(q.getLast()<nums[e] )
            {
                while(!q.isEmpty() && q.getLast()<nums[e])
                    q.removeLast();
                q.add(nums[e]);
               // e++;
            }
            else
                q.add(nums[e]);
           // System.out.print(q);
            if(e-s+1==k)
            {
                temp_ans.add(q.peek());
                if(nums[s]==q.peek())
                    q.remove();
                s++;
            }
            e++;
           
            
            
        }
        int[] ans=new int[temp_ans.size()];
        for(int i=0;i<temp_ans.size();i++)
                ans[i]=temp_ans.get(i);
        return ans;
        
    }
}