import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);  // store unique types
        }

        int maxCandies = candyType.length / 2;

        return Math.min(set.size(), maxCandies);
    }
}