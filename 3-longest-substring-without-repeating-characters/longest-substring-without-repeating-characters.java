class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        Set<Character> visited = new HashSet<>();
        int max = 0;
        
        while(right<s.length()){
            char ch = s.charAt(right); //a
            if(visited.add(ch)){
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                while(s.charAt(left)!=ch){
                    visited.remove(s.charAt(left));
                    left++;
                }
                visited.remove(ch);
                left++;
            }
        }
        return max;
    }
}