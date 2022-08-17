class MyCalendar {
    private ArrayList<int[]> temp=new ArrayList<>();

    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        int n=temp.size();
        if(n==0)
        {
            int[] t=new int[2];
            t[0]=start;
            t[1]=end;
            temp.add(t);
            return true;
            
        }
        for(int i=0;i<n;i++)
        {
            if(end>temp.get(i)[0] && start<temp.get(i)[1])
                return false;
            
        }
        int[] t=new int[2];
            t[0]=start;
            t[1]=end;
            temp.add(t);
            return true;   
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */