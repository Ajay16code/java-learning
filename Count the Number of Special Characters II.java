class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lowerLast = new int[26];
        int[] upperFirst = new int[26];

        Arrays.fill(lowerLast, -1);
        Arrays.fill(upperFirst, Integer.MAX_VALUE);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerLast[ch - 'a'] = i;
            } else {
                upperFirst[ch - 'A'] = Math.min(upperFirst[ch - 'A'], i);
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (lowerLast[i] != -1 &&
                upperFirst[i] != Integer.MAX_VALUE &&
                lowerLast[i] < upperFirst[i]) {
                count++;
            }
        }

        return count;
    }
}
