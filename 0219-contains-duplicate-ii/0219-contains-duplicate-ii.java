import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Keep only k previous elements
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            // Duplicate found within distance k
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}