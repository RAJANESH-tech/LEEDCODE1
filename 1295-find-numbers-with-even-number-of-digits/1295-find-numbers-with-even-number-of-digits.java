class Solution {
    public int findNumbers(int[] nums) {
        int n=0;
        for(int ns:nums)
        {
            int c=0;
            while(ns>0)
            {
                c++;
                ns/=10;
            }
            if(c%2==0)
            {
                n++;
            }
        }
        return n;
    }
}