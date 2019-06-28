import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestExec {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2); // also check by keeping 4 instead of 2....4threads will
                                                              // execute simultaneously
        es.execute(new MyThread());
        es.execute(new MyThread());
        es.execute(new MyThread());
        es.execute(new MyThread());

        es.shutdown();
    }
}

class MyThread implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}