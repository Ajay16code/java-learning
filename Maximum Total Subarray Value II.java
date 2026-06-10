import java.util.*;

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        ArrayList<Long> values = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int mx = nums[i];
            int mn = nums[i];

            for (int j = i; j < n; j++) {
                mx = Math.max(mx, nums[j]);
                mn = Math.min(mn, nums[j]);

                values.add((long) mx - mn);
            }
        }

        values.sort(Collections.reverseOrder());

        long ans = 0;

        for (int i = 0; i < k; i++) {
            ans += values.get(i);
        }

        return ans;
    }
}
