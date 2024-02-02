public class Deltoday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("length");
		int n=sc.nextInt();
		System.out.println("T");
		int T=sc.nextInt();
		int[][] a=new int[n][2];
		System.out.println("array");
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++)
			a[i][j]=sc.nextInt();
		}
		Arrays.sort(a,(x,y) -> y[1]-x[1]);
		int u=0,i=0;
		while(T!=0) {
			int min=Math.min(a[i][0], T);
			u=u+a[i++][1]*min;
			T=T-min;
		}
		System.out.println("max units : "+u);
	}

}
