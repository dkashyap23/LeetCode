class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder s1=new StringBuilder(s);
        //StringBuilder srev=new StringBuilder();
        String srev=s1.reverse().toString();
        System.out.println(s1+" "+srev);
        if(s.equals(srev))
            return 1;
        else
            return 2;
        
    }
}