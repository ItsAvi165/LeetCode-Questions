class Solution {
    public int minMoves(int[] nums) {
        //The problem is basically count the difference between each element and the min       //element from the array 
        //First find the min element from the array
        int min = nums[0];
        for (int x : nums) min = Math.min(min, x);
        int ans = 0;
        for (int x : nums) 
            ans += x - min;
        return ans;
    }
}