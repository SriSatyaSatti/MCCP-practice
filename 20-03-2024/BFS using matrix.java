import java.util.*;
public class MyClass {
    static void BFS(int a[][],int n,int v){
        Queue<Integer> s=new LinkedList<>();
        s.add(v);
        int visited[]=new int[n];
        while(!s.isEmpty()){
            int k=s.poll();
            if(visited[k]==0)
            System.out.print(k+" ");
            visited[k]=1;
            for(int i=0;i<n;i++){
                if(visited[i]==0 && a[k][i]==1)
                s.add(i);
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
        BFS(a,n,v);
    }
}
