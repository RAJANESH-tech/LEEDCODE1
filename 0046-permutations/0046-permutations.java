class Solution {
    static List<List<Integer>> a=new ArrayList<>();
    static void f(int x,int nums[])
    {
        if(x==nums.length)
        {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            a.add(list);
            return;
        }
        for(int i=x;i<nums.length;i++)
        {
            int t=nums[x];
            nums[x]=nums[i];
            nums[i]=t;
            f(x+1,nums);
            t=nums[x];
            nums[x]=nums[i];
            nums[i]=t;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
         a.clear();
         f(0,nums);
         return a;
    }
}