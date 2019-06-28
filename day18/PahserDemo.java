import java.util.concurrent.Phaser;

class TestPhaser{
    public static void main(String[] args) {
        Phaser ph=new Phaser(1);
        int curPhase;
        System.out.println("Starting");
        new MyThread(ph,"A");
        new MyThread(ph,"B");
        new MyThread(ph,"C");

        curPhase=ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("Phase: "+curPhase+" complete");

        curPhase=ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("Phase: "+curPhase+" complete");

        curPhase=ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("Phase: "+curPhase+" complete");

        ph.arriveAndDeregister()
        if(ph.isTerminated())
        System.out.println("bye!!");

    }
}

class MyThread implements Runnable{
    Phaser ph;
    String name;
    MyThread(Phaser p,String n){
        ph=p;
        name=n;
        ph.register();
        new Thread(this).start();
    }
    public void run(){
        System.out.println("Thread "+name+" phase one");
        ph.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (Exception e) {
            //TODO: handle exception

            System.out.println("Thread "+name+" phase two");
            ph.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception
            }

            System.out.println("Thread "+name+" phase three");
        }
    }

}