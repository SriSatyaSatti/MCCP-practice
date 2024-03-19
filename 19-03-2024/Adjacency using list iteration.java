import java.util.*;
public class HelloWorld {
    static void graph(Scanner sc, int n){
    HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
    int u,v,ch=1;
    int r=sc.nextInt();
    while(ch==1){
        System.out.print("Enter edge with nodes between 0 and "+n+": ");
        u=sc.nextInt();
        v=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        if(!h.containsKey(u)){
            a.add(v);
            h.put(u,a);
        }else{
            a=h.get(u);
            a.add(v);
            h.put(u,a);
        }
        System.out.print("Enter 1 to continue");
        ch=sc.nextInt();
    }
    DFS(h,n,r);
}
    static void DFS(HashMap<Integer,ArrayList<Integer>> h,int n,int v){
        Stack<Integer> s=new Stack<>();
        s.push(v);
        int visited[]=new int[n];
        while(!s.isEmpty()){
            int k=s.pop();
            if(visited[k]==0)
            System.out.print(k+" ");
            visited[k]=1;
        for(Integer i:h.get(v)){
            if(visited[i]==0)
                s.push(i);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        graph(sc,n);
    }
}
