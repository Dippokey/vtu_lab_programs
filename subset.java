import java.util.Scanner;

public class subset {

	static int x[] = new int[10]; 
	static int a[] = new int[10]; 
	static int n,d, sum=0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the sum");
		d= sc.nextInt();
		
		//calculate sum
		for(int i=0; i<n; i++)
			sum+=a[i];
		
		if (sum<d)
			System.out.println("no soln");
		else
		{
			sub(0, 0, sum);
		}
		
	}
	
	static void sub(int cs, int k, int r)
	{
		x[k] = 1;
		if(cs + a[k] == d) {
			System.out.println("soln found");
			for(int i=0; i<=k; i++) {
				if(x[i] == 1) {
					System.out.println(a[i]+" ");
				}
			}
			
		}
		else if(cs+a[k]+a[k+1] <= d)
			sub(cs+a[k], k+1, r-a[k]);
		if(cs+r-a[k]>=d  && cs+a[k]<=d) {
			x[k] = 0;
			sub(cs, k+1, r-a[k]);
		}
		
	}
}
