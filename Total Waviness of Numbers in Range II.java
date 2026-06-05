import java.util.*;

class Solution {

    private String digits;
    private Map<String, long[]> memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long n) {
        if (n < 0) return 0;

        digits = String.valueOf(n);
        memo = new HashMap<>();

        long[] result = dfs(0, -1, -1, true, true);
        return result[1];
    }

    private long[] dfs(int pos, int prev1, int prev2,
                       boolean leadingZero, boolean tight) {

        if (pos == digits.length()) {
            return new long[]{1, 0};
        }

        String key = pos + "," + prev1 + "," + prev2 + ","
                   + leadingZero + "," + tight;

        if (!tight && memo.containsKey(key))
            return memo.get(key);

        int limit = tight ? digits.charAt(pos) - '0' : 9;

        long count = 0;
        long wavinessSum = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nextTight = tight && (d == limit);

            if (leadingZero && d == 0) {
                long[] next = dfs(pos + 1, -1, -1,
                                  true, nextTight);

                count += next[0];
                wavinessSum += next[1];
            } else {

                int add = 0;

                if (prev2 != -1) {
                    if ((prev2 < prev1 && prev1 > d) ||
                        (prev2 > prev1 && prev1 < d)) {
                        add = 1;
                    }
                }

                long[] next = dfs(pos + 1,
                                  d,
                                  prev1,
                                  false,
                                  nextTight);

                count += next[0];
                wavinessSum += next[1] + add * next[0];
            }
        }

        long[] ans = new long[]{count, wavinessSum};

        if (!tight)
            memo.put(key, ans);

        return ans;
    }
}
