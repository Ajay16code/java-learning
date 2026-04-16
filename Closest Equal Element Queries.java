import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        Map<Integer, List<Integer>> extMap = new HashMap<>();
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            List<Integer> ext = new ArrayList<>(list);
            for (int x : list) ext.add(x + n);
            extMap.put(key, ext);
        }

        List<Integer> res = new ArrayList<>();

        for (int q : queries) {
            List<Integer> ext = extMap.get(nums[q]);

            if (ext.size() == 2) { // only one occurrence
                res.add(-1);
                continue;
            }

            int ans = Integer.MAX_VALUE;

     
            int pos = Collections.binarySearch(ext, q);
            if (pos > 0)
                ans = Math.min(ans, Math.abs(ext.get(pos - 1) - q));
            if (pos < ext.size() - 1)
                ans = Math.min(ans, Math.abs(ext.get(pos + 1) - q));

     
            int pos2 = Collections.binarySearch(ext, q + n);
            if (pos2 > 0)
                ans = Math.min(ans, Math.abs(ext.get(pos2 - 1) - (q + n)));
            if (pos2 < ext.size() - 1)
                ans = Math.min(ans, Math.abs(ext.get(pos2 + 1) - (q + n)));

            res.add(ans);
        }

        return res;
    }
}
