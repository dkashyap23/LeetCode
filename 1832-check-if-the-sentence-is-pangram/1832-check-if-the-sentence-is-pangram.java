class Solution {
    public boolean checkIfPangram(String sen) {
        int[] arr=new int[26];
        for(int i=0;i<sen.length();i++)
            arr[sen.charAt(i)-'a']=1;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
                return false;
        }
        return true;
        
    }
}