class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int leftMax[] = new int[size];
        int rightMax[] = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            if (height[i] > leftMax[i - 1]) {
                leftMax[i] = height[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (i == size - 1) {
                rightMax[size - 1] = height[size - 1];
            } else if (height[i] > rightMax[i + 1]) {
                rightMax[i] = height[i];
            } else {
                rightMax[i] = rightMax[i + 1];
            }
        }

        int trappedWater = 0;
        for (int i = 0; i < size; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trappedWater;
    }
}