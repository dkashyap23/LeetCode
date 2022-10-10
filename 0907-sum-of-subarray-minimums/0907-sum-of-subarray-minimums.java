class Solution {
    public int[] nextSmaller(int[] A,int n)
    {
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty())
                res[i]=n;
            else if(A[st.peek()]<A[i])
                    res[i]=st.peek();
            else
            {
                while(!st.isEmpty() && A[st.peek()]>=A[i])
                        st.pop();
                if(st.isEmpty())
                    res[i]=n;
                else
                    res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int[] prevSmaller(int[] A,int n)
    {
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
                res[i]=-1;
            else if(A[st.peek()]<=A[i])
                    res[i]=st.peek();
            else
            {
                while(!st.isEmpty() && A[st.peek()]>A[i])
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
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] next_small=nextSmaller(arr,n);
        int[] prev_small=prevSmaller(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(prev_small[i]+" ");
        System.out.println();
        long ans=0;
        long mod=1000000007;
        for(int i=0;i<n;i++)
        {
            int left=prev_small[i];
            int right=next_small[i];
            long subarrays=(1L*(i-left)*(right-i))%mod;
            long contri=(arr[i]*subarrays)%mod;
            ans=(ans+contri)%mod;
            //ans=ans%mod+contri%mod;
            ans=(ans+mod)%mod;
            System.out.println(contri);
        }
        return (int)ans;
    }
}
//71+55*3+82+55*2
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
