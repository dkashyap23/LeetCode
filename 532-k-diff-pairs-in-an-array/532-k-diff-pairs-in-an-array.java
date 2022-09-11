class Solution {
    public int findPairs(int[] A, int B) {
        int n=A.length;
        Arrays.sort(A);
        int count=0;
        int i=0;
        int j=1;
        HashSet<String> set=new HashSet<>();
        while(j<n)
        {
            if(A[j]-A[i]==B)
            {
                String a=Integer.toString(A[j]);
                String b=Integer.toString(A[i]);
                String s=a+"-"+b;
                //System.out.println(s);
                if(set.contains(s)==false)
                {
                set.add(s);
                count++;
                }
                i++;    
                j++;
                
            }
            else if(A[j]-A[i]>B)
            {
                i++;
                if(i+1>j)
                    j++;
            }
            else
                j++;
        }
        return count;

        
    }
}