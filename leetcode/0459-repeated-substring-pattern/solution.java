class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int j = n/2; j >= 1; j--) {
            if (n % j == 0) {
                String sub = s.substring(0, j);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n/j; i++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
 
