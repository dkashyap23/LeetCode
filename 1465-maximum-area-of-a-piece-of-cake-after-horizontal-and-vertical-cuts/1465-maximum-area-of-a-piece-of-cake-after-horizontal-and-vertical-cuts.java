class Solution {
    public int maxArea(int h, int w, int[] hori, int[] verti) {
        int hl=hori.length;
        int vl=verti.length;
        Arrays.sort(hori);
        Arrays.sort(verti);
        long hmax=hori[0];
        long vmax=verti[0];
        
        if(hl==1)
            hmax=Math.max(hori[0],h-hori[0]);
        else
        {
            for(int i=1;i<hl;i++)
            {
                int d=(hori[i]-hori[i-1]);
               hmax=Math.max(hmax,d); 
            }
            hmax=Math.max(hmax,(h-hori[hl-1]));   
        }
        
       // System.out.println(hmax);
        
        if(vl==1)
            vmax=Math.max(verti[0],w-verti[0]);
        else
        {
            for(int i=1;i<vl;i++)
            {
                int d=(verti[i]-verti[i-1]);
               vmax=Math.max(vmax,d); 
            }
            vmax=Math.max(vmax,(w-verti[vl-1]));   
        }
        int mod=1000000000+7;
        //hmax=hmax%mod;
        //vmax=vmax%mod;
      //  System.out.println(vl);
        System.out.println(hmax+" "+vmax);
        return (int)((long)hmax * vmax % 1000000007);
        
    }
}