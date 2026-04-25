from typing import List
import bisect

class Solution:
    def maxDistance(self, side: int, points: List[List[int]], k: int) -> int:
        pos = []

        # Step 1: map to perimeter
        for x, y in points:
            if y == 0:
                pos.append(x)
            elif x == side:
                pos.append(side + y)
            elif y == side:
                pos.append(3 * side - x)
            else:
                pos.append(4 * side - y)

        pos.sort()
        m = len(pos)
        perimeter = 4 * side

        # Step 2: extend array
        ext = pos + [p + perimeter for p in pos]

        # Step 3: check function
        def can(dist):
            for start in range(m):
                count = 1
                curr = ext[start]

                for _ in range(k - 1):
                    # find next valid point using binary search
                    nxt = bisect.bisect_left(ext, curr + dist)
                    if nxt >= start + m:
                        break
                    curr = ext[nxt]
                    count += 1

                if count >= k:
                    # final circular check
                    if perimeter - (curr - ext[start]) >= dist:
                        return True

            return False

        # Step 4: binary search
        low, high = 0, 2 * side
        ans = 0

        while low <= high:
            mid = (low + high) // 2
            if can(mid):
                ans = mid
                low = mid + 1
            else:
                high = mid - 1

        return ans
