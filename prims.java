import java.util.Scanner;

public class prims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vertex");
		n = sc.nextInt();
		
		int w[][] = new int[n+1][n+1];
		System.out.println("Enter the weighted matrix");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				w[i][j] = sc.nextInt();
			}
		}
		
		
		//source vertex
		int s;
		System.out.println("Enter the source vertex");
		s = sc.nextInt();
		
		//arr[] = 0;
		int arr[] = new int[n+1];
	
		int min,k = 1;
		int sum = 0;
		int u=0,v=0,flag=0;
		
		//make source vertex visited
		arr[s]=1;
		
		while(k<n) {
		min = 99;	
			//source
			for(int i=1; i<=n; i++) {
				
				//other vertex
				for(int j=1; j<=n; j++) {
					
					//check for the source.v to be 1 and the comparing vertex is unvisited
					if(arr[i]==1 && arr[j]==0) {
						
						//compare the weight of the vertex with min
						if(w[i][j] < min) {
							
							min = w[i][j];
							//get a edge
							u=i;
							v=j;
							
								
						}
						
					}
				}
			}
			sum+=w[u][v];
			arr[v]=1; //visited
			k++;
			System.out.println("u ="+u+" v ="+v+" dist="+min);
			
		}
		
		//for left out vertex
		for(int i=1; i<=n; i++)
			if(arr[i]==0)
				flag=1;
		if(flag==1)
			System.out.println("prim not possible");
		else
			System.out.println("the minimum cost is="+sum);	

	}

}
