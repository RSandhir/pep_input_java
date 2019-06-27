import java.util.concurrent.CountDownLatch;

class CDLash{
    public static void main(String[] args) throws Exception{
        CountDownLatch cdl=new CountDownLatch(5);
        System.out.println("Starting");
        new MyThread(cdl);
        try{
            cdl.await();
        }
        catch(Exception e){}
        for(int i=0;i<5;i++){
            System.out.println("main:"+i);
            Thread.sleep(100);
        }
        System.out.println("Done");
    }
}
class MyThread implements Runnable{
    CountDownLatch latch;
    MyThread(CountDownLatch latch){
        this.latch=latch;
        new Thread(this).start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("After cd");
            for(i=0;i<5;i++){
                System.out.println("child:"+i);
                try{Thread.sleep(100);}catch(Exception e){}
            }
        }
    }
}