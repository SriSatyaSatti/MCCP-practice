import java.util.*;
public class MyClass {
    static int fun(int n,int a[]){
        Arrays.sort(a);
        int x=a[n-1]*a[n-2]*a[n-3];
        int y=a[0]*a[1]*a[n-1];
        return Math.max(x,y);
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int r=fun(n,a);
      System.out.print(r);
    }
}
