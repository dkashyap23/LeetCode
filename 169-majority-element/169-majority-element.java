class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int me=arr[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==me)
                count++;
            else if(count==0)
            {
                me=arr[i];
            }
            else
                count--;
        }
        return me;
    }
    
}