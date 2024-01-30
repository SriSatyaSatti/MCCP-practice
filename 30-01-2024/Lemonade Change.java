import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m=new int[n];
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
		}
		System.out.println(find(n,m));
	}

	static boolean find(int n, int[] m) {
		int f=0,ten=0,tw=0;
		for(int i=0;i<n;i++) {
			if(m[i]==5) {
				f++;
			}
			else if(m[i]==10) {
				if(f>0) {
					f--;
					ten++;
				}
				else return false;
			}
			else if(m[i]==20) {
				if(ten>0 && f>0) {
					ten--;
					f--;
					tw++;
				}
				else if(f>=3) {
					f=f-3;
					tw++;
				}
				else
					return false;
			}
		}
		return true;
	}

}
