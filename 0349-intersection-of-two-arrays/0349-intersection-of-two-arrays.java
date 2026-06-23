class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a=new HashSet<>();
        for(int x:nums1)
        {
            a.add(x);
        }
        HashSet<Integer> d=new HashSet<>();
        for(int x:nums2)
        {
            if(a.contains(x))
            {
                d.add(x);
            }
        }
        int[] c=new int [d.size()];
        int i=0;
        for(int x:d)
        {
            c[i++]=x;
        }
        return c;
        

    }
}