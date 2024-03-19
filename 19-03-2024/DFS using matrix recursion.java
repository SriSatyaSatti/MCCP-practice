import java.util.*;
public class MyClass {
    static void DFS(int a[][],int n,int v,int visited[]){
            if(visited[v]==0)
            System.out.print(v+" ");
            visited[v]=1;
            for(int i=0;i<n;i++){
                if(visited[i]==0 && a[v][i]==1)
                DFS(a,n,i,visited);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int visited[]=new int[n];
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int v=sc.nextInt();
        DFS(a,n,v,visited);
    }
}
