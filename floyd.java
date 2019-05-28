import java.util.Scanner;

public class floyd {
	
	void fld(int w[][], int n) {
		int i,j,k;
		for( i=1; i<=n; i++)
			for( j=1; j<=n; j++)
				for( k=1; k<=n; k++)
					w[i][j] = Math.min(w[i][j], w[i][k] + w[k][j]);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vertex");
		n = sc.nextInt();
		
		int w[][] = new int[n+1][n+1];
		System.out.println("Enter the weighted matrix");
		for(int i=1; i<=n; i++) 
			for(int j=1; j<=n; j++) {
				w[i][j] = sc.nextInt();
				
			}
		floyd fl = new floyd();
		fl.fld(w, n);
		
		System.out.println("the shortest path matrix is");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++)
			{
				System.out.print(w[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}


