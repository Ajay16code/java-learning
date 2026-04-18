class Solution {
    public int mirrorDistance(int num) {
        int original = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return Math.abs(original - rev);
    }
}
