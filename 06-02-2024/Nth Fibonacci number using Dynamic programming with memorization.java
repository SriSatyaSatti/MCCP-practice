import java.util.*;
public class MyClass {
    static int fib(int n){
        if(n<2)
        return n;
        else
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=fib(n);
      System.out.println(r);
    }
}
