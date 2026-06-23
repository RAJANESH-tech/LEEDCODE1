class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i]+1)==nums[i+1])
            {
                continue;
            }
            else
            {
                return nums[i]+1;
            }
        }
        if(nums[0]!=0)
        {
            return 0;
        }
        else
        {
        return nums[nums.length-1]+1;
        }
    }
}