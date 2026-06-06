class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int [] ans = new int[n];

        for(int i=0;i<n;i++)
        {
            int leftnum = 0;
            int rightnum = 0;
            for(int j= 0;j<i;j++)
            {
                leftnum += nums[j];
            }
            for(int j= i+1;j<n;j++)
            {
                rightnum += nums[j];
            }

            ans[i] = Math.abs(leftnum - rightnum);

            leftnum += nums[i];

        }
        return ans;

    }
}
