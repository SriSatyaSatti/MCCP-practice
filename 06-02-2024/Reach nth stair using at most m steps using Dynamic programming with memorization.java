import java.util.*;
public class MyClass {
    static int count(int n,int m){
        if(n<2)
        return 1;
        else if(n==2)
        return 2;
        else{
        for(int j=1;j<=m && j<=n;j++)
        return count(n-1,m)+count(n-2,m)+count(n-3,m);
        }
        return 0;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int r=count(n,m);
      System.out.println(r);
    }
}
