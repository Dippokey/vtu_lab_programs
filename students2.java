import java.util.*;


class students2{
    String  usn, name, branch;
    long phn;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("enter the no. of students");
        n = sc.nextInt();

        students2 obj[] = new students2[n];//making the array of type student

        int i;
        for (i=0; i<n; i++){
            obj[i] = new students2();//allocating memory of every index

            System.out.println("Enter the details of the students");
            System.out.println("Enter the name");
            obj[i].name = sc.next();
            System.out.println("Enter the usn");
            obj[i].usn = sc.next();
            System.out.println("Enter the branch");
            obj[i].branch = sc.next();
            System.out.println("Enter the phn");
            obj[i].phn = sc.nextLong();

        }

        for (i=0; i<n; i++){
            System.out.println("the details of "+obj[i].name+" is:");

            System.out.println("USN is "+obj[i].usn);
            System.out.println("branch is "+obj[i].branch);
            System.out.println("phn is "+obj[i].phn);

            System.out.println("-------------------------------");

            }
    }
}