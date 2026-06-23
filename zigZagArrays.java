class Solution {
    public int zigZagArrays(int n, int l, int r) {
        final long MOD = 1_000_000_007L;

        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Length = 2
        for (int i = 0; i < m; i++) {
            up[i] = i;              // values smaller than current
            down[i] = m - 1 - i;    // values greater than current
        }

        // Build lengths 3..n
        for (int len = 3; len <= n; len++) {

            long[] prefixUp = new long[m + 1];
            long[] prefixDown = new long[m + 1];

            for (int i = 0; i < m; i++) {
                prefixUp[i + 1] = (prefixUp[i] + up[i]) % MOD;
                prefixDown[i + 1] = (prefixDown[i] + down[i]) % MOD;
            }

            long totalUp = prefixUp[m];

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            for (int i = 0; i < m; i++) {
                // Need previous move DOWN and smaller value
                newUp[i] = prefixDown[i];

                // Need previous move UP and larger value
                newDown[i] = (totalUp - prefixUp[i + 1] + MOD) % MOD;
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        if (n == 2) {
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
            return (int) ans;
        }

        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}
