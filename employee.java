import java.util.*;


class staff{
   int Id;
   String Name;
   float ph,sal;
    staff(int id,String name,float ph,float sal){
       Id = id;
       Name = name;
       this.ph = ph;
       this.sal = sal;
    } 
    //the display function
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("ID: "+Id);
        System.out.println("Phone: "+ph);
        System.out.println("Salary: "+sal);

    }
   
}
class teaching extends staff{
    String domain;
    int publications;
    teaching(int id,String name,float ph,float sal,String tdomain,int tpublications){
      super(id,name,ph,sal);
      domain = tdomain;
      publications = tpublications;
      
    }
    void display(){
        super.display();
        
        System.out.println("Domain: "+domain);
        System.out.println("Publications: "+publications);
      
    }
}
class technical extends staff{
    String skills;
    technical(int id,String name,float ph,float sal, String skills){
        super(id, name, ph, sal);
        this.skills=skills;


    }
    void display(){
        super.display();
        System.out.println("Skills: "+skills);

    }
}

class contract extends staff{
    int period;
    contract(int id,String name,float ph,float sal, int periods){
        super(id, name, ph, sal);
        period= periods;

    }
    void display(){
        super.display();
        System.out.println("Periods: "+period);
        
    }
}
class employee{
    public static void main(String args[]){

        //declaring
        int i;
        String name,domain,skills;
        int id,publications,period;
        float ph,sal;


        
        teaching t[] = new teaching[3];
        technical te[] = new technical[3];
        contract c[] = new contract[3];
        
       

   

        Scanner sc = new Scanner(System.in);
        //technical
        for(i=0;i<1;i++){
        System.out.println("enter the name");
        name = sc.next();
        System.out.println("enter the phn");
        ph = sc.nextFloat();
        System.out.println("enter the id");
        id = sc.nextInt();
        System.out.println("enter the sal");
        sal = sc.nextFloat();
        System.out.println("enter the skills");
        skills = sc.next();
        te[i] = new technical(id, name, ph, sal, skills);
        }


       
        //teaching
        for(i=0;i<1;i++){
            System.out.println("enter the name");
            name = sc.next();
            System.out.println("enter the phn");
            ph = sc.nextFloat();
            System.out.println("enter the id");
            id = sc.nextInt();
            System.out.println("enter the sal");
            sal = sc.nextFloat();
            System.out.println("enter the domain");
            domain = sc.next();
            System.out.println("enter the publications");
            publications = sc.nextInt();
            t[i] = new teaching(id, name, ph, sal, domain, publications);

            }

            //contract
            for(i=0;i<1;i++){
                System.out.println("enter the name");
                name = sc.next();
                System.out.println("enter the phn");
                ph = sc.nextFloat();
                System.out.println("enter the id");
                id = sc.nextInt();
                System.out.println("enter the sal");
                sal = sc.nextFloat();
                System.out.println("enter the period");
                period = sc.nextInt();
                c[i] = new contract(id, name, ph, sal, period);
                }


            //displaying each of them
             for(i=0;i<1;i++){
                 t[i].display();
             }   
             for(i=0;i<1;i++){
                te[i].display();
            }   
            for(i=0;i<1;i++){
                c[i].display();
            }   
    
        

    }
}