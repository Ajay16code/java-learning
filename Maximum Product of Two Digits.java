class Solution {
    public int maxProduct(int n) {
        int max1 = 0, max2 = 0;
        for(; n != 0; n/=10)
        {
            int last = n % 10;
            if(last >= max1)
            {
                max2 = max1;
                max1 = last;
            }
            else if(last > max2)
            {
                max2 = last;
            }
        }
        return max1 * max2;
        
    }
}
