import java.util.*;

//multi threading is a process by which we can carry out operations parrallel and simultaneously
//interface used in this is known as runnable and class is thread
//
class square implements Runnable{
    int x;
    square(int x){
        this.x = x;
    }
    public void run(){
        System.out.println("square is "+(x * x));
    }
}
//n run the content will parallely run with other threads

class cube implements Runnable{
    int y;
    cube(int y){
        this.y=y;
    }
    public void run(){
        System.out.println("cube is"+ (y * y * y));
    }
} 
//getting a number
class first extends Thread{  //mthreading starts here thats y extends
    public void run(){
        int n,i;
        Random r = new Random(); //creating random numbers
        
        try {
            for(i=0; i<3; i++)
            {
                n = r.nextInt(100);//0-99 range random
                System.out.println("the number generated is " +n);
                Thread t1 = new Thread(new square(n) ); //allocating memeory with new
                
                t1.start();//the run in square class function get initialized
                //in start it calls the run

                Thread t2 = new Thread(new cube(n));
                t2.start();

                Thread.sleep(5000);//it gives a time gap between the next process
                //its in milliseconds

                

            }
        }

        catch(Exception e){
            System.out.println(e);

        }
    }

}

class mthread{
    public static void main(String[] args) {
        first obj = new first();
        obj.start();

    }
}



