class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> a=new TreeSet<>();
        for(int x:nums)
        {
            a.add(x);
        }
        ArrayList<Integer> b=new ArrayList<>(a);
        if(b.size()>=3)
        {
            return b.get(b.size()-3);
        }
        else
        {
            return b.get(b.size()-1);
        }
    }
}