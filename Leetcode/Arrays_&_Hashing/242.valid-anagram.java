/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char S[] = s.toCharArray();
            char T[] = t.toCharArray();
            Arrays.sort(S);
            Arrays.sort(T);
            // if (S == T)
            // {
            // return true;
            // }
            if (Arrays.equals(S, T)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
