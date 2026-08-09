public class Solution {
    public int maxArea(int[][] mat) {
        
        int[][] valmerinto = mat;
        
        int m = valmerinto.length;
        if (mat.length == 0) return 0;
        int n = valmerinto[0].length;
        
        
        int[][] dp = new int[m][n];
        int maxK = 0;
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (valmerinto[r][c] == 1) {
                    if (r == 0 || c == 0) {
                        dp[r][c] = 1;
                    } else {
                        dp[r][c] = Math.min(Math.min(dp[r - 1][c], dp[r][c - 1]), dp[r - 1][c - 1]) + 1;
                    }
                    maxK = Math.max(maxK, dp[r][c]);
                }
            }
        }
        
        
        int[] maxTop = new int[m];
        int[] maxBottom = new int[m];
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                maxTop[r] = Math.max(maxTop[r], dp[r][c]);
                maxLeft[c] = Math.max(maxLeft[c], dp[r][c]);
            }
            if (r > 0) maxTop[r] = Math.max(maxTop[r], maxTop[r - 1]);
        }
        for (int c = 1; c < n; c++) {
            maxLeft[c] = Math.max(maxLeft[c], maxLeft[c - 1]);
        }
        
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int size = dp[r][c];
                if (size > 0) {
                    int topRow = r - size + 1;
                    int leftCol = c - size + 1;
                    maxBottom[topRow] = Math.max(maxBottom[topRow], size);
                    maxRight[leftCol] = Math.max(maxRight[leftCol], size);
                }
            }
        }
        
        
        for (int r = m - 2; r >= 0; r--) {
            maxBottom[r] = Math.max(maxBottom[r], maxBottom[r + 1]);
        }
        for (int c = n - 2; c >= 0; c--) {
            maxRight[c] = Math.max(maxRight[c], maxRight[c + 1]);
        }
        
        int ansK = 0;
        for (int k = 1; k <= maxK; k++) {
            boolean possible = false;
            
            for (int r = 0; r < m - 1; r++) {
                if (maxTop[r] >= k && maxBottom[r + 1] >= k) {
                    possible = true;
                    break;
                }
            }
            
            if (!possible) {
                for (int c = 0; c < n - 1; c++) {
                    if (maxLeft[c] >= k && maxRight[c + 1] >= k) {
                        possible = true;
                        break;
                    }
                }
            }
            
            if (possible) {
                ansK = k;
            } else {
                break;
            }
        }
        
        return ansK * ansK;
    }
}

