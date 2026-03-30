class Solution {
    int MOD = 1000000007;
    int[][][] dp;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<= maxMove;k++)
                {
                    dp[i][j][k] = -1;
                }
            }
        }
        return dfs(m,n,maxMove,startRow,startColumn);
    }

    private int dfs(int m,int n,int moves, int i, int j)
    {
    if(i<0||j<0||i>=m||j>=n)
    { 
        return 1;
    }
    if(moves == 0)
    {
        return 0;
    }
    if(dp[i][j][moves] != -1)return dp[i][j][moves];
    long result =0;

    result += (dfs(m,n,moves-1,i+1,j)) % MOD;
    result += (dfs(m,n,moves-1,i-1,j)) % MOD;
    result += (dfs(m,n,moves -1,i,j+1)) % MOD;
    result += (dfs(m,n,moves - 1,i,j-1)) % MOD;

    // dp[i][j][moves] = (int)(result % MOD);
    return dp[i][j][moves] = (int) (result % MOD);
    }
}
