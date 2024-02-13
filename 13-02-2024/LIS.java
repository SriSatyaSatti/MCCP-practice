import java.util.*;
public class MyClass {
    static int operations(int a[],int n){
    int[] t=new int[n];
    for(int i=0;i<n;i++){
        t[i]=1;
    }
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(a[i]>a[i-1])
            t[i]=Math.max(t[i],t[j]+1);
        }
    }
    int max=0;
    for(int i=0;i<n;i++){
       max=Math.max(max,t[i]);
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
