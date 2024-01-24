import java.util.*;
public class MyClass {
    static int fun(int n,char[] c,int k){
        int count=0,i=0,j=0;
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        for(int q=0;q<n;q++){
            if(c[q]=='P')
            p.add(q);
            if(c[q]=='T')
            t.add(q);
        }
        while(i<p.size() && j<t.size()){
            int s=Math.abs(p.get(i)-t.get(i));
            if(s<=k){
                i++;
                j++;
                count++;
            }
            else if(s>k)
            j++;
            else
            i++;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[] a=new char[n];
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
            a[c++]=s.charAt(i);
        }
        int k=sc.nextInt();
        int r=fun(n,a,k);
        System.out.print(r);
     
    }
}
