import java.util.*;
public class HelloWorld {
    static void graph(Scanner sc, int n){
    HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
    int u,v,ch=1;
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
    for(Integer a:h.keySet()){
        for(Integer i:h.get(a)){
            System.out.print("There is an edge between "+a+" and "+i);
        }
    }
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        graph(sc,n);
    }
}
