// { Driver Code Starts
import java.util.*; 
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int sum = sc.nextInt();
		    Solution ob=new Solution();
		    System.out.println(ob.subArraySum(arr,n,sum));
		}
	}
}

// } Driver Code Ends


class Solution
{ 
    public static int subArraySum(int[] arr, int n, int k)
    { 
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<n;i++)
        {
         sum+=arr[i];
         if(mp.containsKey(sum-k))
            ans+=mp.get(sum-k);
        mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
        
        //code here.
    }
}








  