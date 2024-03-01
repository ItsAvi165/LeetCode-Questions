class Solution {

    public static void reverseArray(int nums[], int sp, int ep){
    while(sp<ep){
        int temp = nums[sp];
        nums[sp] = nums[ep];
        nums[ep] = temp;
        sp++;
        ep--;
    }
    }
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    reverseArray(nums,0,n-1);
    reverseArray(nums,0,k-1);
    reverseArray(nums,k,n-1);
    }
}