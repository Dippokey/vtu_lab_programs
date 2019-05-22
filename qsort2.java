import java.util.Scanner;
import java.util.Random;
public class quickSort {
	static int max = 2000;
	int partition(int a[],int low,int high) {
		int i,j,p,temp;
		p = a[low];
		i = low+1;
		j = high;
		while(low<high) {
			while(a[i]<=p && i<high)
				i++;
			while(a[j]>p)
				j--;
			if(i<j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			else {
				temp = a[low];
				a[low] = a[j];
				a[j] = temp;
				return j;
			}
		}
		return j;
	}
	void sort(int a[],int low,int high) {
		if(low<high) {
			int s = partition(a,low,high);
			sort(a,low,s-1);
			sort(a,s+1,high);
		}
	}
	public static void main(String args[]){
		int[] a;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		Random r = new Random();
		a = new int[max];
		for(i=0;i<n;i++) {
			a[i] = r.nextInt(20);
		}
		System.out.println("Array before sorting: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		long startTime = System.nanoTime();
		quickSort q = new quickSort();
		q.sort(a,0,n-1);
		long stopTime = System.nanoTime();
		long elapseTime = stopTime - startTime;
		System.out.println("Array after sorting: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Elasped time: "+elapseTime);
	}
}