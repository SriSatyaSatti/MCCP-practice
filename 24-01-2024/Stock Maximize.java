import java.util.*;
public class MyClass {
    static int maxProfit(int n,int[] a){
        int maxsofar=0,profit=0;
        for(int i=n-1;i>=0;i--){
            maxsofar=Math.max(maxsofar,a[i]);
            profit+=(maxsofar-a[i]);
        }
        return profit;

      // int n=prices.length;
      // int profit=0;
      // for(int i=1;i<n;i++){
      //     if(prices[i]>prices[i-1]){
      //         profit+=(prices[i]-prices[i-1]);
      //     }
      // }  
      // return profit;
        
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
