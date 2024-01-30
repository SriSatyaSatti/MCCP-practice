import java.util.*;
class Job{
    int a;
    int b;
    public Job(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class sortObj implements Comparator<Job>{
    public int compare(Job j1,Job j2){
        return j2.b-j1.b;
    }
}
public class MyClass {
    static int count(int[] start,int[] finish,int n){
        Job current=new Job(0,0);
        ArrayList<Job> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new Job(start[i],finish[i]));
        }
        Collections.sort(a,new sortObj());
        int count=0;
        Job last=a.get(0);
        for(int i=1;i<a.size();i++){
            current=a.get(i);
            if(current.b>last.a){
                last=current;
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(count(a,b,n));
    }
}
