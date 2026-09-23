class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for(int num : nums) 
            total += num ;
        int target = total - x;
        if(target<0) return -1;
        if(target == 0) return n;
        int left = 0;
        int sum = 0;
        int longest = -1;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            while(left <= i && sum > target)
                sum -= nums[left++];
            if(sum==target)
                longest = Math.max(longest,i-left+1);
        }
        return longest == -1 ? -1:n-longest;
    }
}
