class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                curr++;
            else {
                ans = Math.max(ans, curr);
                curr = 0;
            }
        }

        return Math.max(curr, ans);
    }
}