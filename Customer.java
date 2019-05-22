import java.util.Scanner;
import java.util.StringTokenizer;


class Customer{

   String name,date;

   //READ func
   void read(){
     Scanner sc  = new Scanner(System.in);
     System.out.println("Enter your name and date: ");

     name = sc.next();
     date = sc.next();  
   } 


   //display func
   void display(){

       String delim = "/";//delimiters : breaks the string by the delim

       StringTokenizer st = new StringTokenizer(date,delim);
       // string tokenizer allows an application to break a string into tokens

       System.out.println(name + " ");

       while(st.hasMoreElements()){//return true for more tokens
           System.out.print(st.nextElement()+" ");//returns next token in the string
       }
   }

   //main
   public static void main(String args[]){

       int i,n;

       System.out.println("Enter number of customers: ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();

       Customer cus[] = new Customer[n];//creates an array of object of that class
       
       for(i=0;i<n;i++){
           System.out.println("Enter details for cutomer "+(i+1)+" : ");
           cus[i] = new Customer();//allocating for each index

           cus[i].read();
       }
       
       //display
       for(i=0;i<n;i++)
       {
           cus[i].display();
       }
   }
}


