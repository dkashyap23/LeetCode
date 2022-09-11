class Solution {
    public int findPairs(int[] A, int B) {
          int n=A.length;
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++)
                mp.put(A[i],mp.getOrDefault(A[i],0)+1);
            int count=0;
            for(int i:mp.keySet())
            {
                if(B>0 && mp.containsKey(i+B) || B==0 & mp.get(i)>1)
                    count++;
            }
            return count;
        
    }
}