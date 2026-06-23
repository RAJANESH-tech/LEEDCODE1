class Solution {
    public int[] shortestToChar(String s, char c) {
        int []a=new int [s.length()];
        for(int i=0;i<s.length();i++)
        {
            int f=Integer.MAX_VALUE;
            int d=Integer.MAX_VALUE;
        
            
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)==c)
                {
                   f=j-i;
                 break;
                }
                
            }
            for(int k=i;k>=0;k--)
            {
                if(s.charAt(k)==c)
                {
                    d=i-k;
                
                    break;
                }
            } 
            if(f<d)
            {
                a[i]=f;
            }
            else
            {
                a[i]=d;
            }
        }
        return a;
    }
}