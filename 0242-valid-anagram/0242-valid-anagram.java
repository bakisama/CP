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
            return Arrays.equals(S, T);
        }
    }
}
