import java.util.*;

public class MyClass {
    static int micehole(int[] m,int h[],int n){
        Arrays.sort(m);
		Arrays.sort(h);
		int max=0;
		for(int i=0;i<n;i++) {
			max=Math.max(Math.abs(m[i]-h[i]),max);
		}
		return max;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m=new int[n];
		int[] h=new int[n];
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
		}
		System.out.println(micehole(m,h,n));
	}

}
