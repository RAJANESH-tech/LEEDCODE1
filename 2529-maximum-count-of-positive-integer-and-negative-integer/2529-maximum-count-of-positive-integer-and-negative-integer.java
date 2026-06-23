class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int v=0;
        for(int n:nums)
        {
            if(n>0)
            {
                p++;
            }
            else if(n<0)
            {
                v++;
            }
        }
        if(p>v)
        {
            return p;
        }
        else
        {
            return v;
        }
    }
}