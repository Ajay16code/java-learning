import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        
        // Flatten grid
        for (int[] row : grid) {
            for (int num : row) {
                list.add(num);
            }
        }
        
        // Check feasibility
        int rem = list.get(0) % x;
        for (int num : list) {
            if (num % x != rem) return -1;
        }
        
        // Sort
        Collections.sort(list);
        
        // Find median
        int median = list.get(list.size() / 2);
        
        // Calculate operations
        int ops = 0;
        for (int num : list) {
            ops += Math.abs(num - median) / x;
        }
        
        return ops;
    }
}
