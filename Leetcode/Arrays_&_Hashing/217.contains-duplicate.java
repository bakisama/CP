/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] == nums[j])
                return true;
        }
        return false;

    }
}
// @lc code=end
