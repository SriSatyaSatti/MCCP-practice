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
			a[i]=sc.nextInt();
		}
		System.out.println("array");
		for(int i=0;i<n2;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("array");
		for(int i=0;i<n3;i++) {
			c[i]=sc.nextInt();
		}
		int s1=0,s2=0,s3=0;
		s1=sum(a);s2=sum(b);s3=sum(c);
		int i=0,k=0,j=0;
		while(s1!=s2 || s2!=s3) {
			if(s1>s2 && s1>s3) {
				s1-=a[i++];
			}
			else if(s2>s1 && s2>s3) {
				s2-=b[j++];
			}
			else {
				s3-=c[k++];
			}
		}
		System.out.println(s1);
	}
	private static int sum(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++) 
			s=s+a[i];
		return s;
	}

}
