import java.util.*;
public class MyClass {
    static int fun(int n,int a[]){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            p.add(a[i]);
        }
        int c=0;
        while(p.size()>1){
            int k1=p.poll();
            int k2=p.poll();
            c+=(k1+k2);
            p.add(k1+k2);
        }
        return c;
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
