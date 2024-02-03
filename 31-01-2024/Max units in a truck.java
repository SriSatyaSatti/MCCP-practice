public class MyClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int T=sc.nextInt();
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++)
			a[i][j]=sc.nextInt();
		}
		Arrays.sort(a,(x,y) -> y[1]-x[1]);
		int u=0,i=0;
		while(T!=0  && i<a.length) {
			int min=Math.min(a[i][0], T);
			u=u+a[i++][1]*min;
			T=T-min;
		}
		System.out.println("max units : "+u);
	}

}
