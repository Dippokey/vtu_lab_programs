import java.util.*;

class stack2{
    static int top=-1;
    int i;
    final static int max = 100;

    

    static int arr[] = new int[max];

    void push(int n){
        

        if (top==max-1){
            System.out.println("Overflow");
        }
        else{
            top++;
            arr[top]=n;

        }
        
    }

    void pop(){
        if (top==-1){
            System.out.println("Underflow");

        }
        else{
            top--;
        }
    }
    void display(){
        if (top==-1){
            System.out.println("Underflow");
            
        }
        else{
            int j;
            for (j=top; j>=0; j--){
                System.out.println(arr[j]);
            }
        }
    }
    
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("choose from the following \n 1. push \n 2. pop \n 3. display \n 4. exit \n");
            ch = sc.nextInt();

            stack2 obj = new stack2();

            switch(ch){

                case 1 : {
                    System.out.println("enter the number u want to add");
                    int num;
                    num=sc.nextInt();
                    obj.push(num);
                    break;
                } 

                case 2 : {
                    obj.pop();
                    break;
                }

                case 3 : {
                    obj.display();
                    break;

                }
                case 4 : {
                    System.exit(0);
                }

                default : {
                    System.out.println("Invalid choice!!");

                }

            }

        }

        
    }
}
