class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum = nums[0], max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current_sum = nums[i]>(current_sum + nums[i])?nums[i]:(current_sum + nums[i]);
            max_sum = max_sum>current_sum?max_sum:current_sum;
        }
        return max_sum;
    }
}