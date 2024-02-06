import java.util.*;
public class MyClass {
    static int fib(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=fib(n);
      System.out.println(r);
    }
}
