class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer w1=new StringBuffer("");
        StringBuffer w2=new StringBuffer("");
        for(String s:word1)
            w1.append(s);
        for(String s:word2)
            w2.append(s);
        String s1=w1.toString();
        String s2=w2.toString();
        //System.out.print(w1+"*"+w2);
        return s1.equals(s2);
        
    }
}