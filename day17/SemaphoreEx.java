import java.util.concurrent.Semaphore;
//Shared Resource
class Shared{
    static int count=0;
}
//Thread that increases count
class IncThread implements Runnable{
    String name;
    Semaphore sem;
    IncThread(Semaphore s,String name){
        this.name=name;
        sem=s;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("Starting "+name);
        try{
            System.out.println(name+" Requesting permit");
            sem.acquire();
            System.out.println(name+" Gets permit");
            for(int i=0;i<5;i++){
                Shared.count++;
                System.out.println(name+" : "+Shared.count);
                Thread.sleep(50);
            }
        }
        catch(Exception e){}
        System.out.println(name+" REleasing permit");
        sem.release();
    }

}
//Dec thread
class DecThread implements Runnable{
    String name;
    Semaphore sem;
    DecThread(Semaphore s,String name){
        this.name=name;
        sem=s;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("Starting "+name);
        try{
            System.out.println(name+" Requesting permit");
            sem.acquire();
            System.out.println(name+" Gets permit");
            for(int i=0;i<5;i++){
                Shared.count--;
                System.out.println(name+" : "+Shared.count);
                Thread.sleep(50);
            }
        }
        catch(Exception e){}
        System.out.println(name+" REleasing permit");
        sem.release();
    }

}
class SemaphoreEx{
    public static void main(String[] args) {
        Semaphore sem=new Semaphore(1);//!Argument tells no of threads allowd at a time
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}