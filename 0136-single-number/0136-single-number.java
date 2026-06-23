class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        for(int n:nums)
        {
            if(a.contains(n))
            {
                a.remove(n);
            }
            else
            {
                a.add(n);
            }
        }
        return a.iterator().next();
    }
}