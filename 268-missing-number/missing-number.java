class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNNumbers = n*(n+1)/2;
        int sumOfArray = 0;

        for(int i=0;i<n;i++){
            sumOfArray += nums[i];
        }

        return sumOfNNumbers - sumOfArray;
    }
}