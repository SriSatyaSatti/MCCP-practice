import java.util.*;
public class MyClass {
    static int operations(int a[],int n){
        if(n==0 || n==1)
        return 0;
        if(n==2 || n==3)
        return 1;
        int m=Integer.MAX_VALUE;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;
        for(int i=4;i<n;i++){
            int ans1=dp[i-1];
            int ans2=(i%2==0)?dp[i/2]:m;
            int ans3=(i%3==0)?dp[i/3]:m;
            dp[i]=1+Math.min(Math.min(ans1,ans2),ans3);
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
        System.out.print(operations(a,n));
    }
}
