import java.util.Scanner;



class exception
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();

        try {
            int answer;
            answer = a/b;
            System.out.println(answer);

        
        }//if there is an error here it will execute catch
        

        catch(ArithmeticException e) {
            System.out.println(e);

        }

    }
}