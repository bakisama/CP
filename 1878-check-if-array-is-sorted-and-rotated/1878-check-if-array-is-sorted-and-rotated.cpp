class Solution {
public:
    bool check(vector<int>& nums) {
        int size = nums.size();
        int rotation_amount = 0;
        for(int i = 1; i<size;i++){
            if(nums[i]>=nums[i-1]) rotation_amount ++;
            else break;
        }
        rotate(nums.begin(), nums.begin() + rotation_amount+1, nums.end());
        for(int x : nums) cout<<x<<" ";
        for(int i = 1; i<size;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
};