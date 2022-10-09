//taught in scaler stack 2 class
class Solution {
    public int[] LNS(int[] A,int n)
    {
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
                res[i]=-1;
            else if(A[st.peek()]<A[i])
                res[i]=st.peek();
            else if(A[st.peek()]>=A[i])
            {
                while(!st.isEmpty() && A[st.peek()]>=A[i])
                    st.pop();
                if(st.isEmpty())
                    res[i]=-1;
                else
                    res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    //Right nearest small
    public int[] RNS(int[] A,int n)
    {
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty())
                res[i]=n;
            else if(A[st.peek()]<A[i])
                res[i]=st.peek();
            else if(A[st.peek()]>=A[i])
            {
                while(!st.isEmpty() && A[st.peek()]>=A[i])
                    st.pop();
                if(st.isEmpty())
                    res[i]=n; //Keeping end points diff
                else
                    res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left_small=LNS(heights,n);
        int[] right_small=RNS(heights,n);
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int left=i-(left_small[i]+1);
            int right=(right_small[i]-1)-i;
            ans=Math.max(ans,heights[i]*(left+right+1));
        }
        return ans;
        
        
    }
}