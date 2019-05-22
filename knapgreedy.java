import java.util.*;


//take profit by weight ratio

class knapgreedy{
    public static void main(String[] args) {
    
        int n, cap;

        System.out.println("enter the number of items");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("enter the capacity");
        cap = sc.nextInt();

        int arr[][] = new int[2][n];

        System.out.println("sabke weigths!!");
        for(int i=0; i<n; i++){
            arr[0][i] = sc.nextInt();
        }

        System.out.println("sabke profit dede!!");
        for(int i=0; i<n; i++){
            arr[1][i] = sc.nextInt();
        }

        int j=0, m;
        float sum=0, max;

        m = cap;
        while(m>=0){//checks for space
            max = 0;
            for(int i=0; i<n; i++){

                //type casting
                //maximum of profit/weight

                if( ( (float) arr[1][i] ) /( (float) arr[0][i] ) > max ){
                    max = ( (float) arr[1][i] ) /( (float) arr[0][i] );
                    j=i;

                }
            } 
            
            // if weight of that item is greater than the capacity we added it in the knapsack
            if (arr[0][j] > m){//doubt-------------------
                System.out.println("Quantity of item number: " +(j+1) +"added is " +arr[0][j]);
                m= m - arr[0][j];  //subtracting the remaining
                sum = sum + (float) arr[1][j];

                arr[1][j] = 0;
            }

        }


        System.out.println("the profit is " +sum);



        
    }
}
