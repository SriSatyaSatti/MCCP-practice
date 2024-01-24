import java.util.*;
public class MyClass {
    static int fun(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed=1,result=1;
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat_needed++;
                i++;
            }
            else if(arr[i]>dep[j]){
                plat_needed--;
                j++;
            }
            if(plat_needed>result)
            result=plat_needed;
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        int r=fun(a,d,n);
        System.out.print(r);
     
    }
}
