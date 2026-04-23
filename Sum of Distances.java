class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: group indices
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Step 2: process each group
        for (List<Integer> idx : map.values()) {
            int k = idx.size();

            long[] prefix = new long[k + 1];

            // prefix sum
            for (int i = 0; i < k; i++) {
                prefix[i + 1] = prefix[i] + idx.get(i);
            }

            // calculate distances
            for (int i = 0; i < k; i++) {
                long cur = idx.get(i);

                long left = i * cur - prefix[i];
                long right = (prefix[k] - prefix[i + 1]) - (k - i - 1) * cur;

                res[idx.get(i)] = left + right;
            }
        }

        return res;
    }
}