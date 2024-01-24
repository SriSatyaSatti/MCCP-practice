import java.util.*;
public class MyClass {
    static Boolean jump(int n,int[] a){
        int last=n-1;
        for(int i=n-2;i>=0;i--){
            if((a[i]+i)>=last)
            last=i;
        }
        if(last==0)
        return true;
        return false;
    } 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Boolean r=jump(n,a);
        System.out.print(r);
    }
}
