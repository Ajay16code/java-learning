class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n / 2;
        
        char[] firstHalfChars = s.substring(0, halfLen).toCharArray();
        Arrays.sort(firstHalfChars);
        String first = new String(firstHalfChars);
        String firstReversed = new StringBuilder(first).reverse().toString();

        if (n % 2 == 0) {
            return first + firstReversed;
        } else {
            String middle = String.valueOf(s.charAt(halfLen));
            return first + middle + firstReversed;
        }

    }
}
