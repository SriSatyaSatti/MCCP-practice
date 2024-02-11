import java.util.*;
public class MyClass {
    static int cal(int m,int n){
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1]+dp[i-1][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int res=cal(m,n);
        System.out.print(res);
    }
}
