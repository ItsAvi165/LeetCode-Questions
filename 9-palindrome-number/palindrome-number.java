class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int temp = x;
        while(x > 0){
            int digit = x % 10;
            ans = (ans * 10) + digit;
            x = x / 10;
        }
        return ans == temp ? true : false;
    }
}