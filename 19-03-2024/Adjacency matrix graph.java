import java.util.*;
public class HelloWorld {
    static void graph(Scanner sc, int n){
    int a[][]=new int[n][n];
    int u,v,ch=1;
    while(ch==1){
        System.out.print("Enter edge with nodes between 0 and "+n+": ");
        u=sc.nextInt();
        v=sc.nextInt();
        a[u][v]=1;
        System.out.print("Enter 1 to continue");
        ch=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("There is an edge between "+i+" and "+j);
        }
    }
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        graph(sc,n);
    }
}
