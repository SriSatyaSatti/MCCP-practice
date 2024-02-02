import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("length");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[n];
		System.out.println("array");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int s=0;
		for(int i=0;i<n;i++) {
			s=s+a[i]*b[n-i-1];
		}
		System.out.println("minimum sum : "+s);
	}

}
