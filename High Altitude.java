class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxat = 0;
        for(int g : gain)
        {
            alt += g;
            maxat = Math.max(maxat,alt);
        }
        return maxat;
    }
}
