import java.util.*;
public class MyClass {
    static int count(int n,int m){
        int res[]=new int[n+1];
        res[0]=1;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=n;i++){
            res[i]=0;
            for(int j=1;j<=m && j<=i;j++){
                res[i]+=res[i-j];
            }
        }
        return res[n];
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int r=count(n,m);
      System.out.println(r);
    }
}
