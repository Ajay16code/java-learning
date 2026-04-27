import java.util.*;

class Solution {
    
    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    
    // allowed directions for each type
    int[][][] typeDirs = {
        {},
        {{2},{3}},     // 1: left, right
        {{0},{1}},     // 2: up, down
        {{2},{1}},     // 3: left, down
        {{3},{1}},     // 4: right, down
        {{2},{0}},     // 5: left, up
        {{3},{0}}      // 6: right, up
    };

    public boolean hasValidPath(int[][] grid) {   // ✅ FIXED NAME
        int m = grid.length, n = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        
        q.offer(new int[]{0,0});
        vis[0][0] = true;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            
            if(r == m-1 && c == n-1) return true;
            
            for(int[] d : typeDirs[grid[r][c]]){
                int dir = d[0];
                int nr = r + dirs[dir][0];
                int nc = c + dirs[dir][1];
                
                if(nr < 0 || nc < 0 || nr >= m || nc >= n) continue;
                if(vis[nr][nc]) continue;
                
                // check reverse connection
                for(int[] back : typeDirs[grid[nr][nc]]){
                    int bdir = back[0];
                    int br = nr + dirs[bdir][0];
                    int bc = nc + dirs[bdir][1];
                    
                    if(br == r && bc == c){
                        vis[nr][nc] = true;
                        q.offer(new int[]{nr,nc});
                        break;
                    }
                }
            }
        }
        
        return false;
    }
}
