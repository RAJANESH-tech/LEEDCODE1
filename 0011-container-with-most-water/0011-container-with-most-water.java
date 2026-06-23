class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j)
        {
            int w=Math.abs(j-i);
            int m=Math.min(height[i],height[j]);
            int c=w*m;
            if(max<c)
            {
                max=c;
            }
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;
    }
}