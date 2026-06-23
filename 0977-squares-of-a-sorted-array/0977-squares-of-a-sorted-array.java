class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int x=Math.abs(nums[i]);
            nums[i]=x*x;
        }
        Arrays.sort(nums);
        return nums;
    }
}