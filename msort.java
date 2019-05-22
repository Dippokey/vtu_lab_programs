import java.io.*;
import java.util.*;



class msort{

    void divide(int arr[], int l, int r){

        if (l<r){
            int m = (l+r)/2;
            divide(arr, l, m);
            divide(arr, m+1, r);
            merge(arr, l, m, r);
            

        }

    }

    void merge(int arr[], int l, int m, int r){

        //initializaiton
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //filling the array
        for(int i=0; i<n1; i++){
            L[i] = arr[i+l];
            
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[j+m+1];
        }

        int i=0, j=0, k=l;

        while (i<n1 && j<n2){

            if (L[i]<=R[j]){
                arr[k] = L[i];
                k++;
                i++;

            }
            else{
                arr[k] = R[j];
                k++;
                j++;

            }
        }
        while (i<n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }    

    public void display(int arr[], int n){
        int i;
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();

        int arr[] = new int[n];

        Random r = new Random();

        for(i=0; i<n; i++){
            arr[i] = r.nextInt(n);
        }

        msort obj = new msort();
        
        System.out.println("the array is:");
        obj.display(arr, n);

        //time calculation
        long startTime = System.nanoTime();
        
        obj.divide(arr, 0, n-1);
       

        long endTime = System.nanoTime();

        
        System.out.println("the sorted array is:");
        obj.display(arr, n);
        
        double elapse = endTime-startTime;
        double time = elapse/1000000;

        System.out.println("the time taken is "+time  );
        
    }
}