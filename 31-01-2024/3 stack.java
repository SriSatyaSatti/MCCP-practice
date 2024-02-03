import java.util.*;
public class MyClass{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("length1");
		int n1=sc.nextInt();
		System.out.println("length2");
		int n2=sc.nextInt();
		System.out.println("length3");
		int n3=sc.nextInt();
		int[] a=new int[n1];
		int[] b=new int[n2];
		int[] c=new int[n3];
		System.out.println("array");
		for(int i=0;i<n1;i++) {
			S1[i]=sc.nextInt();
		}
		System.out.println("array");
		for(int i=0;i<n2;i++) {
			S2[i]=sc.nextInt();
		}
		System.out.println("array");
		for(int i=0;i<n3;i++) {
			S3[i]=sc.nextInt();
		}
        int a = 0; 
        int b = 0; 
        int c = 0; 
        for (int i: S1) a += i;
        for (int i: S2) b += i;
        for (int i: S3) c += i;
        
        int i = 0, j = 0, k = 0;
        while (a != b || b !=c || c!=a) {
            if (a > b || a > c) a -= S1[i++];
            if (b > c || b > a) b -= S2[j++];
            if (c > a || c > b) c -= S3[k++];
        }
		System.out.println(a);
	}
	private static int sum(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++) 
			s=s+a[i];
		return s;
	}

}
