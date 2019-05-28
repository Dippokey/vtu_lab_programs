import java.util.*;

public class tsp {

	public static void main(String[] args) {
		
		int c[][] = new int[10][10];//cost matrix
		int tour[] = new int[10];   //tour array
		
		int i, j, cost, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of cities");
		n = sc.nextInt();
		
		//if only 1 city is given
		if(n==1)
		{
			System.out.println("tsp not possible");
			System.exit(0);
			
		}
		
		System.out.println("enter the number cost matrix");
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				c[i][j] = sc.nextInt();
				
			}
		}
		
		//initiating all tour values in ascending order
		for(i=1; i<=n; i++) {
		 tour[i] = i;
		}
		
		//calculating cost
		cost = tspdp(c, tour, 1, n);
		
		//displaying it
		for(i=1; i<=n; i++) {
			System.out.print(tour[i]+ "->");
			}
		System.out.println(1);
		System.out.println("mincost = "+cost);
	}
	
	static int tspdp(int c[][], int tour[], int start, int n) {
		int mintour[] = new int[10];
		int temp[] = new int[10];
		
		int i,j,ccost;
		int mincost = 999;
		
		//when end is reached
		if(start==n-1)
			return (c[tour[n-1]][tour[n]]+c[tour[n]][1]);
		
		//calculate temp
		for(i=start+1; i<=n; i++) 
		{
			for(j=1; j<=n; j++)
				temp[j]= tour[j];
			temp[start+1] = tour[i];
			temp[i] = tour[start+1];
		
			//calculate the minimum tour and cost
			if((c[tour[start]][tour[i]]+(ccost= tspdp(c, temp, start+1, n))) < mincost) 
			{
				mincost = c[tour[start]][tour[i]]+ccost;
				for(int k =1; k<=n; k++) 
				{
					mintour[k] = temp[k];//copy the values stored in temp
				}
			}
		}
		
		//calculate tour
		for(i=1; i<=n; i++)
			tour[i] = mintour[i];
		return mincost;
	}

}
//0 10 15 20
//5 0 9 10 
//6 13 0 12
//8 8 9 0
