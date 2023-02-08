//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int i=0;
        int j=0;
        int mid=(m+n)/2;
        int k=0;
        int ele=0;
        int x=0;
        int y=0;
        while(i<n && j<m)
        {
            if(a[i]<=b[j])
            {
                ele=a[i];
                i++;
            }
            else
            {
                ele=b[j];
                j++;
            }
            if(k==mid-1)
               x=ele;
            if(k==mid)
                y=ele;
            k++;
        }
        //System.out.println("x "+x+" y"+y);
        while(i<n && k<=mid)
        {
            if(k==mid-1)
                x=a[i];
            if(k==mid)
                y=a[i];
            k++;
            i++;
        }
        while(j<m && k<=mid)
        {
            if(k==mid-1)
                x=b[j];
            if(k==mid)
                y=b[j];
            k++;
            j++;
        }
        if((m+n)%2!=0)
            return y;
        return (x+y)/2.0;
        // Your Code Here
    }
}