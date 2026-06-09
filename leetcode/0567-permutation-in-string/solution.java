class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Count frequencies of s1 and first window of s2
        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (matches(s1Count, windowCount))
            return true;

        // Slide the window
        for (int i = n; i < m; i++) {
            windowCount[s2.charAt(i) - 'a']++;         // add new character
            windowCount[s2.charAt(i - n) - 'a']--;     // remove old character

            if (matches(s1Count, windowCount))
                return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}
