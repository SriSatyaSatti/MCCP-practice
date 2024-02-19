import java.util.*;
public class MyClass {
    static int operations(int val[],int[] wt,int m,int w){
        int[][] dp=new int[m+1][w+1];
        for(int i=0;i<m;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<w;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[m][w];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int w[]=new int[m];
        for(int i=0;i<m;i++){
            w[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        System.out.print(operations(a,w,m,n));
    }
}
