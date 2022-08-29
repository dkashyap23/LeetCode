class Solution {
    public int minimumSum(int num) {
        String s=Integer.toString(num);
        char[] c=new char[4];
        c=s.toCharArray();
        Arrays.sort(c);
        String n1=""+c[0]+c[2];
        String n2=""+c[1]+c[3];
        int no1=Integer.valueOf(n1);
        int no2=Integer.valueOf(n2);
        return (no1+no2);
        
    }
}