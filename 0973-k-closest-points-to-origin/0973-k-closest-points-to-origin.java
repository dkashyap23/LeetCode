class Solution {
    class Point{
        int x;
        int y;
    }
    public int[][] kClosest(int[][] A, int B) {
        PriorityQueue<Point> pq=new PriorityQueue<>((a,b)->{
            int x1=a.x;
            int y1=a.y;
            int x2=b.x;
            int y2=b.y;
            int eq1=(x1*x1+y1*y1);
            int eq2=(x2*x2+y2*y2);
            return eq1-eq2;
        });
        for(int i=0;i<A.length;i++)
        {
            Point p=new Point();
            p.x=A[i][0];
            p.y=A[i][1];
            pq.add(p);
        }
        ArrayList<ArrayList<Integer>> temp_ans=new ArrayList<>();
       // System.out.println(pq.size());
        while(B>0)
        {
            B--;
            ArrayList<Integer> temp=new ArrayList<>();
            Point tempPoint=pq.poll();
            temp.add(tempPoint.x);
            temp.add(tempPoint.y);
            temp_ans.add(temp);
           // ans.add(pq.poll());
        }
        int[][] ans=new int[temp_ans.size()][2];
        for(int i=0;i<temp_ans.size();i++)
        {
            ans[i][0]=temp_ans.get(i).get(0);
            ans[i][1]=temp_ans.get(i).get(1);
        }
        return ans;
        
        
    }
}