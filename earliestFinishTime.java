class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        return Math.min(
            calc(landStartTime, landDuration, waterStartTime, waterDuration),
            calc(waterStartTime, waterDuration, landStartTime, landDuration)
        );
    }

    private int calc(int[] start1, int[] dur1, int[] start2, int[] dur2) {
        int minEnd = Integer.MAX_VALUE;

        // Earliest finish time of first ride
        for (int i = 0; i < start1.length; i++) {
            minEnd = Math.min(minEnd, start1[i] + dur1[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Finish time after taking second ride
        for (int i = 0; i < start2.length; i++) {
            ans = Math.min(ans,
                    Math.max(minEnd, start2[i]) + dur2[i]);
        }

        return ans;
    }
}
