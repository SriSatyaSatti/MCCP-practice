import java.util.*;
public class MyClass {
    static int[] fun(int n,int a[]){
        int l[]=new int[n];
        int r[]=new int[n];
        int p1=1,p2=1;
        for(int i=0;i<n;i++){
            l[i]=p1;
            p1*=a[i];
        }
        for(int i=n-1;i>=0;i--){
            r[i]=p2;
            p2*=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=l[i]*r[i];
        }
        return a;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int[] r=fun(n,a);
      for(int i=0;i<n;i++)
          System.out.print(r[i]+" ");
    }
}
