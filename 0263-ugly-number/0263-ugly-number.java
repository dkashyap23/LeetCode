class Solution {
    public boolean isUgly(int n) {
        while(n%2==0 && n!=0)
        {
            System.out.println("2 --> "+n);
            n=n/2;
        }
         while(n%3==0 && n!=0)
        {
             System.out.println("3--> "+n);
            n=n/3;
        }
         while(n%5==0 && n!=0)
        {
             System.out.println("5--> "+n);
            n=n/5;
        }
        System.out.println(n);
        return n==1?true:false;
        
        
    }
}