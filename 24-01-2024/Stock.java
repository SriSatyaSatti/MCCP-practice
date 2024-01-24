import java.util.*;
public class MyClass {
    static int maxProfit(int n,int[] a){
        int maxsofar=0,max=0;
        for(int i=n-1;i>=0;i--){
            maxsofar=Math.max(maxsofar,a[i]);
            max=Math.max(max,maxsofar-a[i]);
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=maxProfit(n,a);
        System.out.print(r);
     
    }
}
