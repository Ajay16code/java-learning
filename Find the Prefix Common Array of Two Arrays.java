class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        
        boolean[] seenA = new boolean[n + 1];
        boolean[] seenB = new boolean[n + 1];
        
        int common = 0;
        
        for (int i = 0; i < n; i++) {
            
            // Add A[i]
            seenA[A[i]] = true;
            if (seenB[A[i]]) {
                common++;
            }
            
            // Add B[i]
            seenB[B[i]] = true;
            if (A[i] != B[i] && seenA[B[i]]) {
                common++;
            }
            
            ans[i] = common;
        }
        
        return ans;
    }
}
