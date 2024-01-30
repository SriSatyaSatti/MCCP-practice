import java.util.*;

public class MyClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] g=new int[n];
		for(int i=0;i<n;i++) {
			g[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] c=new int[n];
		for(int i=0;i<m;i++) {
			c[i]=sc.nextInt();
		}
		Arrays.sort(g);
		Arrays.sort(c);
		int i=0,j=0,count=0;
		while(i<m && j<n) {
			if(c[i]>=g[j]) {
				count++;
				i++;j++;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
	}
}
