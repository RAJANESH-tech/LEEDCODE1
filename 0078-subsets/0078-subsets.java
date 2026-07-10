class Solution {
    static List<List<Integer>> a=new ArrayList<>();
    static List<Integer> b=new ArrayList<>();
    public static void f(List<Integer> c,int x,int []nums)
    {
        if(x==nums.length)
        {
            a.add(new ArrayList<>(c));
            return;
        }
        c.add(nums[x]);
        f(c,x+1,nums);
        c.remove(c.size()-1);
        f(c,x+1,nums);
    } 
    public List<List<Integer>> subsets(int[] nums) {
        b.clear();
        a.clear();
        f(b,0,nums);
        return a;
    }
}