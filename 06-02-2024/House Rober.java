import java.util.*;
public class MyClass {
    static int maxCount(int n,int[] a){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=a[0];
        for(int i=1;i<n;i++){
            dp[i+1]=Math.max(a[i]+dp[i-1],dp[i]);
        }
        return dp[n];
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int r=maxCount(n,a);
      System.out.println(r);
    }
}
