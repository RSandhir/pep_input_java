import java.util.concurrent.CyclicBarrier;

class BarrierEx{
    public static void main(String[] args) {
        CyclicBarrier cb=new CyclicBarrier(3,new BarAction());//!Starts BarAction THread after 3 threads
        System.out.println("Starting");

        new MyThread(cb,"A");
        new MyThread(cb,"B");
        new MyThread(cb,"C");
        new MyThread(cb,"D");
        new MyThread(cb,"E");
        new MyThread(cb,"F");
    }
}
class MyThread implements Runnable{
    CyclicBarrier cbar;
    String name;
    MyThread(CyclicBarrier cbar,String name){
        this.cbar=cbar;
        this.name=name;
        new Thread(this).start();
    }
    public void run(){
        System.out.println(name);
        try{
            cbar.await();
        }
        catch(Exception e){}
        try{Thread.sleep(100);}
        catch(Exception e){}
        System.out.println("Bye:"+name);
    }
}
class BarAction implements Runnable{
    public void run(){
        System.out.println("Barrier!");
    }
}