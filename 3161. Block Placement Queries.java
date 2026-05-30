class Solution {

    class SegTree {
        int n;
        int[] tree;

        SegTree(int n) {
            this.n = n;
            tree = new int[4 * n];
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        private void update(int node, int l, int r,
                            int idx, int val) {

            if (l == r) {
                tree[node] = val;
                return;
            }

            int mid = (l + r) / 2;

            if (idx <= mid)
                update(node * 2, l, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, r, idx, val);

            tree[node] =
                Math.max(tree[node * 2],
                         tree[node * 2 + 1]);
        }

        int query(int L, int R) {
            return query(1, 0, n - 1, L, R);
        }

        private int query(int node, int l, int r,
                          int L, int R) {

            if (R < l || r < L)
                return 0;

            if (L <= l && r <= R)
                return tree[node];

            int mid = (l + r) / 2;

            return Math.max(
                query(node * 2, l, mid, L, R),
                query(node * 2 + 1, mid + 1, r, L, R)
            );
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        int maxX = 50000;

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        obstacles.add(maxX);

        SegTree seg = new SegTree(maxX + 1);

        for (int i = 1; i <= maxX; i++) {
            seg.update(i, i);
        }

        List<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {

            if (q[0] == 1) {

                int x = q[1];

                Integer left = obstacles.lower(x);
                Integer right = obstacles.higher(x);

                obstacles.add(x);

                seg.update(x, x - left);
                seg.update(right, right - x);

            } else {

                int x = q[1];
                int sz = q[2];

                Integer prev = obstacles.floor(x);

                int best = 0;

                if (prev != null)
                    best = Math.max(best, x - prev);

                best = Math.max(best,
                        seg.query(0, prev == null ? 0 : prev));

                ans.add(best >= sz);
            }
        }

        return ans;
    }
}
