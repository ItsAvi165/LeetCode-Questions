class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length, sum = 0;
        for (int i = 0; i < n; i++) {
            int min = i - k, max = i + k;
            boolean isGood = true;

            if (min >= 0) {
                if (nums[i] <= nums[min]) {
                    isGood = false;
                    continue;
                }
            }

            if (max < n) {
                if (nums[i] <= nums[max]) {
                    isGood = false;
                    continue;
                }
            }

            sum += nums[i];

        }

        return sum;
    }
}