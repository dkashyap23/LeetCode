class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<>();
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int s=0;
        int e=0;
        int i=0;
        while(s<=e && e<n)
        {
            if(!q.isEmpty() &&q.getLast()<nums[e])
            {
                while(!q.isEmpty() && q.getLast()<nums[e])
                    q.removeLast();
                
            }
            q.add(nums[e]);
            if(e-s+1==k)
            {
                ans[i++]=q.peek();
                if(nums[s]==q.peek())
                    q.remove();
                s++;
            }
            e++;
    
        }
        return ans;
        
    }
}