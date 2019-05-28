import java.util.Scanner;

public class kruskal {
	
	//parent node
	int parent[] = new int[10];
	
	//to check if visited or not
	int find(int a){
		int p = a;
		if(parent[p] != 0) {
			p = parent[p];
			
		}
		return p;
		
	}
	
	//to form the edge
	void union(int i, int j) {
		if(i<j) {
			parent[i] =j;
			
		}
		else {
			parent[j] =i;
		}
	} 
	
	void krsk(int a[][], int n)
	{
		int k=0;
		int min, u=0, v=0;
		int i,j;
		int sum = 0;
		while(k<n-1) 
		{
			min = 99;
			
			//with source
			for ( i = 1; i<=n; i++) 
				//comparing vertex
				for ( j = 1; j<=n; j++)
					//check if the weight of the vertex is less than minimum and the vertex is not same
					if(a[i][j]<min && i!=j)
					{
						min = a[i][j];
						u= i;
						v= j;
					}
			//check u and v
			i = find(u);
			j = find(v);
			if(i!=j) 
			{
				union(i,j);
				System.out.println("("+u+","+v+") = "+a[u][v]);
				sum+=a[u][v];
				k++;
			}
			
			//maximize the weight of the visited edge
			a[u][v]=a[v][v]=99;
			
			
		} 
		
		System.out.print("Sum = "+sum);
		
	}
	
	
	public static void main(String[] args) {
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
			
		kruskal kr = new kruskal();
		 kr.krsk(w,n);
		 sc.close();
		 
		
		
		
		
		
	}

}
