import java.util.Scanner;

public class dijkstra {
	
	static int d[] = new int[10]; //distance array
	static int p[] = new int[10]; //included or not array
	static int visited[] = new int[10];
	
	void dijk (int a[][], int s, int n) {
		
		int u=-1;
		int v; //destination vertex
		int min;
		int i,j;
		
		for(v = 0; v<n; v++ ) 
		{
			d[v] = 999; // distance maximized
			p[v] = -1;  //all the vertex not included
		}
		d[s]=0;
		for(i= 0; i<n; i++) 
		{
			min = 999;
			//calculating minimum
			for(j=0; j<n; j++) 
			{
				if (d[j]<min && visited[j]==0)
				{
					min = d[j];
					u = j;
					
				}
			}
			visited[u]=1;
			
			for(v = 0; v<n; v++ )
			{
				if(d[u]+a[u][v] < d[v]  && u!=v && visited[v]==0) {
					d[v]= d[u]+a[u][v]; //calculated the destination distance
					p[v] = u; //include the vertex
				}
			}
			
			
		}
		
		
		
	}
	
	void path(int v, int s) {
		if(p[v]!=1) // -1
			path(p[v],s);
		if(v!=s)
			System.out.print(" -> " +v + " ");
	}
	
	void display(int s, int n) {
		
		int i;
		for(i=0; i<n; i++) {
			if(i!=s) {
				System.out.print(s +" ");
				path(i,s);
			}
			if(i!=s) {
				System.out.print(" = "+d[i] + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int n,s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vertex");
		n = sc.nextInt();
		
		int w[][] = new int[n+1][n+1];
		System.out.println("Enter the weighted matrix");
		for(int i=0; i<n; i++) 
			for(int j=0; j<n; j++) {
				w[i][j] = sc.nextInt();
				
			}
		System.out.println("enter the source");
		s= sc.nextInt();
		
		dijkstra dj = new dijkstra();
		dj.dijk(w, s, n);
		dj.display(s,n);
			
		sc.close();

	}

}
