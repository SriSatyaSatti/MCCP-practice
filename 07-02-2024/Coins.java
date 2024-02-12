class MyClass{
	static int minCoins(int coins[], int M, int V){
	 int[] dp = new int[V + 1];
    Arrays.fill(dp, V + 1); 
    dp[0] = 0;
    for (int i = 1; i <= V; i++) {
        for (int j = 0; j < M; j++) {
            if (coins[j] <= i && dp[i - coins[j]] != V + 1) { 
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
    }
    return dp[V] == V + 1 ? -1 : dp[V];
	} 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=sc.nextInt();
            }
        }
        int res=minCoins(c,m,n);
        System.out.print(res);
    }
}
