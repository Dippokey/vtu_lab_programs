import java.util.*;

class knapdy{

    
    public static void main(String[] args) {
        

        //initialization
        knapdy k = new knapdy();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();

        int profit[] = new int[n+1];
        int wt[] = new int[n+1];


        System.out.println("enter the profit of each items");
        for(int i=1; i<=n; i++){
            profit[i] = sc.nextInt();
        }

        System.out.println("enter the weight of each items");
        for(int i=1; i<=n; i++){
            wt[i] = sc.nextInt();
        }
        
        int cap;
        System.out.println("enter the capacity");
        cap = sc.nextInt();
        
        solve(profit, wt, cap, n);

    }

    static void solve(int profit[], int wt[], int cap, int n){
        
        int i,j;
        int soluchan[][] = new int[n+1][cap+1];

        for(i=0; i<=n; i++){
            for(j=0; j<=cap; j++){

                //for cpmplete 0
                if(i==0 || j==0){
                    soluchan[i][j] = 0;

                }

                //comaring the above items weight and available knapsack weight
                //if weight greater then use the last value of the same capacity
                else if(wt[i]>j){
                    soluchan[i][j] =  soluchan[i-1][j];

                }

                else{

                    //main condition
                    //comparing the max
                    soluchan[i][j] = Math.max(soluchan[i-1][j], soluchan[i-1] [j - wt[i] ] + profit[i] );

                }


            }
        }

        System.out.println("the optimal soluchan is " + soluchan[n][cap]);

        int sel[] = new int[n+1];
        //for no item selected
        for(i=0; i<=n; i++){
            sel[i] = 0;


        }

        
        i=n;
        j=cap;
        
        //calculating x1 x2 x3 x4

        while(i>0 && j>0){

            if (soluchan[i][j] != soluchan[i-1][j]){
                sel[i]=1;
                j = j - wt[i];

            }

            i--;
        }

        System.out.println("item selected are");

        for(i=1; i<=n; i++){ //not including 0

            //check 0 or 1
            if(sel[i]==1){
                System.out.print(i + " ");

            }
        }



    }

}


