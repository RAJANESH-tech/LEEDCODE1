class Solution {
    static List<List<Integer>> a=new ArrayList<>();
    ArrayList<Integer> b=new ArrayList<>();
    static void f(int x,List<Integer> c,int []nums)
    {
        if(x==nums.length)
        {
            a.add(new ArrayList<>(c));
            return;
        }
        c.add(nums[x]);
        f(x+1,c,nums);
        c.remove(c.size()-1);
        while(x+1<nums.length && nums[x]==nums[x+1]) x+=1;
        f(x+1,c,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        a.clear();
        b.clear();
        Arrays.sort(nums);
        f(0,b,nums);
        return a;
    }
}