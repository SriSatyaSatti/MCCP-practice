import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m=new int[n];
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
		}
		int i=0,j=n-1,max=0;
		while(i<j) {
			max=Math.max(Math.min(m[i],m[j])*(j-i),max);
			if(m[i]<m[j])
		    	i++;
			else
				j--;
		}
		System.out.println(max);
	}

}

// Brute Force
// import java.util.*;
// public class MyClass{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		int[] m=new int[n];
// 		for(int i=0;i<n;i++) {
// 			m[i]=sc.nextInt();
// 		}
// 		int max=0;
// 		for(int i=0;i<n;i++) {
// 			for(int j=i+1;j<n;j++)
// 			max=Math.max(Math.min(m[i],m[j])*(j-i),max);
// 		}
// 		System.out.println(max);
// 	}

// }
