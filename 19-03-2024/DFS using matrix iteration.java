import java.util.*;
public class MyClass {
    static void DFS(int a[][],int n,int v){
        Stack<Integer> s=new Stack<>();
        s.push(v);
        int visited[]=new int[n];
        while(!s.isEmpty()){
            int k=s.pop();
            if(visited[k]==0)
            System.out.print(k+" ");
            visited[k]=1;
            for(int i=0;i<n;i++){
                if(visited[i]==0 && a[k][i]==1)
                s.push(i);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int v=sc.nextInt();
        DFS(a,n,v);
    }
}
