class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (isMatch(haystack, needle, i)) {
                return i;
            }
        }

        return -1;
    }

    private boolean isMatch(String haystack, String needle, int start) {
        for (int j = 0; j < needle.length(); j++) {
            if (haystack.charAt(start + j) != needle.charAt(j)) {
                return false;
            }
        }
        return true;
    
    }
}
