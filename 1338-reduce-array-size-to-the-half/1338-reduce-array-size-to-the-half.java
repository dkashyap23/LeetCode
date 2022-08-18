class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        int req_size=n/2;
        int ans=0;
        int[] temp=new int[mp.size()];
        int x=0;
        for(Map.Entry<Integer,Integer> m:mp.entrySet())
        {
            int k=m.getValue();
            temp[x++]=k;
        }
        Arrays.sort(temp);
       // System.out.println(req_size);
        // for(int i=0;i<temp.length;i++)
        // {
        //     System.out.print(temp[i]+" ");
        // }
        int sum=0;
        for(int i=temp.length-1;i>=0;i--)
        {
            sum+=temp[i];
            System.out.println(sum+" "+i);
            if(sum>=req_size)
            {
                ans=temp.length-i;
                break;
            }
            
        }
        return ans;
    }
}