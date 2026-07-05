class Solution {
    static int c=0;
    static int n=0,m=0;
    static boolean f(int i,int j,int d1,int d2,int [][]grid,int [][]s)
    {
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==-1 || s[i][j]==1)
        {
            return false;
        }
        if(i==d1 && j==d2)
        {
            s[i][j]=1;
            boolean t=true;
            for(int q=0;q<n;q++)
            {
                for(int w=0;w<m;w++)
                {
                    if(s[q][w]!=1 && grid[q][w]!=-1)
                    {
                        t=false;
                    }
                }
            }
            if(t)
            {
                c++;
            }
            s[i][j]=0;
            return false;
        }
        s[i][j]=1;
        f(i+1,j,d1,d2,grid,s);
        f(i-1,j,d1,d2,grid,s);
        f(i,j+1,d1,d2,grid,s);
        f(i,j-1,d1,d2,grid,s);
        s[i][j]=0;
        return false;
    }
    public int uniquePathsIII(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int [][]s=new int [n][m];
        int x=-1,y=-1;
        int d1=-1,d2=-1;
        c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    x=i;
                    y=j;
                }
                else if(grid[i][j]==2)
                {
                    d1=i;
                    d2=j;
                }
            }
            if(x!=-1 && y!=-1 && d1!=-1 && d2!=-1)
            {
                break;
            }
        }
        f(x,y,d1,d2,grid,s);
        return c;
    }
}