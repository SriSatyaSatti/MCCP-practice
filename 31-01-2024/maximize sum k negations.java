import java.util.*;
public class MyClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		PriorityQueue<Integer>p=new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			p.add(a[i]);
		}
		for(int i=0;i<k;i++) {
			int t=p.poll();
			p.add(-t);
		}
		int s=0;
		for(int i=0;i<n;i++) {
			s=s+p.poll();
		}
		System.out.println("minimum sum : "+s);
	}
}
