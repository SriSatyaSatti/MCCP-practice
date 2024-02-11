import java.util.*;
public class MyClass {
    static int fun(String s1,String s2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)
                dp[i][j]=0;
                else{
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                    else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    static String LCS(String s1,String s2,int m,int n){
        String res="";
        int dp[][]=new int[m][n];
        dp=fun(s1,s2,m,n);
        int i=m,j=n;
        while(i!=0 && j!=0){
            char c1=s1.CharAt(i-1);
            char c2=s2.charAt(j-1);
            if(c1==c2){
                res=c1+res;
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else
                j--;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int ans=fun(s1,s2,s1.length(),s2.length());
        System.out.print(ans);
    }
}
