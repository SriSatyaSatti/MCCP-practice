import java.util.*;
public class MyClass {
    static int fun(int n,int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<n;i++){
            c+=Math.abs(a[i]-b[i]);
        }
        return c;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
          b[i]=sc.nextInt();
      }
      int r=fun(n,a,b);
      System.out.print(r);
    }
}
