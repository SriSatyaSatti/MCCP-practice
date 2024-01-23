import java.util.*;
public class MyClass {
    static int fun(int n,int a[]){
        int x,ans=0;
        Arrays.sort(a);
        if(n%2==0){
            x=a[(n/2)-1];
        }else{
            x=a[n/2];
        }
        for(int i=0;i<n;i++){
            ans+=Math.abs(a[i]-x);
        }
        return ans;
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
