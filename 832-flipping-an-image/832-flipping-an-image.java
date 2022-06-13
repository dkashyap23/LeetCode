class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        int r=img.length;
        int c=img[0].length;
        for(int i=0;i<r;i++)
        {
            int s=0;
            int e=c-1;
            while(s<e)
            {
                int t=img[i][e];
                img[i][e]=img[i][s];
                img[i][s]=t;
                
                e--;
                s++;
                
            }
            for(int j=0;j<c;j++)
            {
                if(img[i][j]==0)
                    img[i][j]=1;
                else
                    img[i][j]=0;
            }
            
        }
        return img;
        
    }
}