import java.util.*;
public class MyClass {
    static int stairs(int n){
        if(n<3)
        return n;
        else
        return stairs(n-1)+stairs(n-2);
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=stairs(n);
      System.out.println(r);
    }
}
