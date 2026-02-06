class Solution {
    public int maxPower(String s) {
        int ans = 1;
        int curr = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                if (curr > ans) {
                    ans = curr;
                    curr = 1;
                }
                curr = 1;
            }
        }

        return curr > ans ? curr : ans;
    }
}