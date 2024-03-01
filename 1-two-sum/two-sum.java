class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<n;i++){
            int value = target - nums[i];
            if(map.containsKey(value) && map.get(value)!=i)
            return new int[] {i,map.get(value)};
        }
        return new int[]{};
    }
}