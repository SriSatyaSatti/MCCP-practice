import java.util.*;
public class MyClass {
    static int maxSum(int n,int[] a){
        int max=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            max+=(a[i]*i);
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
        int r=maxSum(n,a);
        System.out.print(r);
     
    }
}
