import java.util.*;
public class MyClass {
    static int operations(int a[],int n){
        int max=a[0];
        int cmax=a[0];
        for(int i=1;i<n;i++){
            cmax=Math.max(a[i],cmax+a[i]);
            max=Math.max(cmax,max);
        }
        return max;
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
