class Solution {
    public boolean canConstruct(String ran, String mag) {
        int[] ran_arr=new int[26];
        int[] mag_arr=new int[26];
        for(int i=0;i<ran.length();i++)
            ran_arr[ran.charAt(i)-'a']++;
        for(int i=0;i<mag.length();i++)
            mag_arr[mag.charAt(i)-'a']++;
        for(int i=0;i<26;i++)
        {
            if(ran_arr[i]>mag_arr[i])
                return false;
        }
        return true;
        
    }
}