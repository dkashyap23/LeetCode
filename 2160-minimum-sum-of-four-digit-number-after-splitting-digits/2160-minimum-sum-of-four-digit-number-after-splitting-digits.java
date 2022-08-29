class Solution {
    public int minimumSum(int num) {
        // String s=Integer.toString(num);
        // char[] c=new char[4];
        // c=s.toCharArray();
        // Arrays.sort(c);
        // String n1=""+c[0]+c[2];
        // String n2=""+c[1]+c[3];
        // int no1=Integer.valueOf(n1);
        // int no2=Integer.valueOf(n2);
        // return (no1+no2);
        int[] arr=new int[4];
        int i=0;
        while(num>0)
        {
            arr[i++]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        return (arr[0]*10+arr[3])+(arr[1]*10+arr[2]);
        
      
        
    }
}