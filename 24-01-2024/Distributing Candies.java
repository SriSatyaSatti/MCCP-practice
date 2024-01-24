import java.util.*;
public class MyClass {
    static int[] candies(int a[],int n){
        int res[]=new int[n];
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            l[i]=1;
            r[i]=1;
        }
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                l[i]=l[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(a[i]>a[i+1]){
                r[i]=r[i+1]+1;
            }
        }
        for(int i=0;i<n;i++){
            res[i]=Math.max(l[i],r[i]);
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r[]=candies(a,n);
        for(int i=0;i<n;i++)
        System.out.print(r[i]+" ");
     
    }
}
