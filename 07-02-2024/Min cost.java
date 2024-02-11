import java.util.*;
public class MyClass {
    static int cal(int m,int n,int[][] c){
        int dp[][]=new int[m][n];
        int s=c[0][0];
        for(int i=0;i<m;i++){
            dp[i][0]=s;
            s+=c[i][0];
        }
        s=c[0][0];
        for(int i=0;i<n;i++){
            dp[0][i]=s;
            s+=c[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=c[i][j]+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
            }
        }
        return dp[m-1][n-1];
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
        int res=cal(m,n,c);
        System.out.print(res);
    }
}
