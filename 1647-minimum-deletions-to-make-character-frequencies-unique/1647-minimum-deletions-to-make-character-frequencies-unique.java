class Solution {
    public int minDeletions(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++)
            arr[s.charAt(i)-'a']++;
        Arrays.sort(arr);
        int ans=0;
        for(int i=25;i>0;i--)
        {
            if(arr[i]==0)
            {
                ans+=arr[i-1];
                arr[i-1]=0;
                continue;
            }
            if(arr[i]>arr[i-1])
                continue;
            else if(arr[i]==arr[i-1])
            {
                ans++;
                arr[i-1]-=1;
            }
            else
            {
                int d=arr[i-1]-arr[i]+1;
                ans+=d;
                arr[i-1]=arr[i]-1;
            }
        }
        return ans;
        
    }
}