class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> al = new ArrayList<>();
        al.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > al.get(al.size() - 1)) {
                al.add(nums[i]); //add directly if greater
            } else {
                int index = Collections.binarySearch(al, nums[i]); // find insertion point
                if (index < 0) { // -ve means key not found, +ve means key already exists
                    index = -(index + 1); // get insertion index if key not found
                }
                al.set(index, nums[i]); // replace at that index in both cases (element found vs not found)
            }
        }
        return al.size(); // if want to avoid this size() operation, create a variable to track insertions & return it here
    }
}
// Time complexity - O(nlogn)