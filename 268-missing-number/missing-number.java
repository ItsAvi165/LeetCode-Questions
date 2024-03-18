class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> al = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<=n;i++){
            if(!al.contains(i)) ans = i;
        }
        return ans;

    }
}