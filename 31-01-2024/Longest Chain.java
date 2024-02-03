public class MyClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++)
			a[i][j]=sc.nextInt();
		}
		Arrays.sort(a,(x,y) -> x[1]-y[1]);
		int i=0,j=1,c=1;
		while(j<n) {
			if(a[i][1]<a[j][0]) {
				c++;
				i=j;
				j++;
			}
			else
				j++;
		}
		System.out.println("longest chain length : "+c);
	}

}
