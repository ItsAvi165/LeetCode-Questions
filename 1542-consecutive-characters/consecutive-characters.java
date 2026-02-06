class Solution {
    public int maxPower(String s) {
        int ans = 1;
        int curr = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                if (curr > ans) { //found new consecutive group
                    ans = curr;
                }
                curr = 1; // not maximum group, so just reset the count
            }
        }

        return Math.max(ans, curr);
    }
}
//TC - O(N)
//SC - O(1)