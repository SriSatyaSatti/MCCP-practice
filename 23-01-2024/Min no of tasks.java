import java.util.*;
public class MyClass {
    static int fun(int n,int a[],int t){
        int i=0,ans=0;
        while(ans<=t){
            ans+=a[i];
            i++;
        }
        return i+1;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int t=sc.nextInt();
      int r=fun(n,a,t);
      System.out.print(r);
    }
}
