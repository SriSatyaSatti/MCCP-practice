import java.util.*;
public class MyClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			p.add(a[i]);
		}
		int m1,m2;
		while(p.size()!=1) {
			m1=p.poll();
			m2=p.poll();
			if(m1!=m1)
			p.add(Math.abs(m1-m2));
		}
		System.out.println(p.peek());
	}
}
